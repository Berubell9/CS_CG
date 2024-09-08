#undef GLFW_DLL
#include <iostream>
#include <stdio.h>
#include <string>
#include <string.h>

#include <GL/glew.h>
#include <GLFW/glfw3.h>

#include <vector>
#include <cmath>

#include "Libs/Shader.h"
#include "Libs/Window.h"
#include "Libs/Mesh.h"
#include "Libs/stb_image.h"

#include <glm/glm.hpp>
#include <glm/gtc/matrix_transform.hpp>
#include <glm/gtc/type_ptr.hpp>

const GLint WIDTH = 800, HEIGHT = 600;

float pitch = 0.0f, yaw = -90.0f;

Window mainWindow;
std::vector<Mesh *> meshList;
std::vector<Shader *> shaderList;

// Vertex Shader
static const char *vShader = "Shaders/shader.vert";

// Fragment Shader
static const char *fShader = "Shaders/shader.frag";

Mesh *light;
static const char *LvShader = "Shaders/lightShader.vert";
static const char *LfShader = "Shaders/lightShader.frag";

glm::vec3 lightColour = glm::vec3(1.0f, 1.0f, 1.2f);
static const char *DvShader = "Shaders/Dshader.vert";
static const char *DfShader = "Shaders/Dshader.frag";

Mesh *amp;

Mesh *bird;

Mesh *bg;

Mesh *ground;

Mesh *wing;

Mesh *note;

void CreateTriangle()
{
    GLfloat vertices[] =
        {
            // pos                          //atexCoord
            -1.0f, -1.0f, 0.0f,             0.0f, 0.0f,
            0.0f, -1.0f, 1.0f,              0.5f, 0.0f,
            1.0f, -1.0f, 0.0f,              1.0f, 0.0f,
            0.0f, 1.0f, 0.0f,               0.5f, 1.0f};

    unsigned int indices[] =
        {
            0,3,1,1,
            3,2,2,3,
            0,0,1,2,
        };

    Mesh *obj1 = new Mesh();

    obj1->CreateMesh(vertices, indices, 20, 12);
    for (int i = 0; i < 10; i++)
    {
        meshList.push_back(obj1);
    }
}

void CreateOBJ()
{
    /* Bass ----------------------------------------------------------- */
    
    Mesh *obj = new Mesh();
    bool loaded = obj->CreateMeshFromOBJ("Models/bass.obj");

    if (loaded)
    {
        for (int i = 0; i < 10; i++)
        {
            meshList.push_back(obj);
        }
    }
    else
    {
        std::cout << "Failed to load model" << std::endl;
    }

    /* Bird ----------------------------------------------------------- */
   
    bird = new Mesh();
    loaded = bird->CreateMeshFromOBJ("Models/bird.obj");

    if (!loaded)
    {
        std::cout << "Failed to load model" << std::endl;
    }

    /* AMP ----------------------------------------------------------- */

    amp = new Mesh();
    loaded = amp->CreateMeshFromOBJ("Models/amp.obj");

    if (!loaded)
    {
        std::cout << "Failed to load model" << std::endl;
    }

    /* Background ----------------------------------------------------------- */

    bg = new Mesh();
    loaded = bg->CreateMeshFromOBJ("Models/bg.obj");

    if (!loaded)
    {
        std::cout << "Failed to load model" << std::endl;
    }

    /* Ground ----------------------------------------------------------- */

    ground = new Mesh();
    loaded = ground->CreateMeshFromOBJ("Models/ground.obj");

    if (!loaded)
    {
        std::cout << "Failed to load model" << std::endl;
    }

    /* Light ----------------------------------------------------------- */

    light = new Mesh();
    loaded = light->CreateMeshFromOBJ("Models/cube.obj");

    if (!loaded)
    {
        std::cout << "Failed to load model" << std::endl;
    }

    /* Wing ----------------------------------------------------------- */

    wing = new Mesh();
    loaded = wing->CreateMeshFromOBJ("Models/wing.obj");

    if (!loaded)
    {
        std::cout << "Failed to load model" << std::endl;
    }

    /* Note ----------------------------------------------------------- */

    note = new Mesh();
    loaded = note->CreateMeshFromOBJ("Models/note.obj");

    if (!loaded)
    {
        std::cout << "Failed to load model" << std::endl;
    }
   
}

void CreateShaders()
{   
    // 0
    Shader *shader1 = new Shader();
    shader1->CreateFromFiles(vShader, fShader);
    shaderList.push_back(shader1);

    // 1
    Shader *shader2 = new Shader();
    shader2->CreateFromFiles(DvShader, DfShader);
    shaderList.push_back(shader2);

    // 2
    Shader *shader3 = new Shader();
    shader3->CreateFromFiles(DvShader, DfShader);
    shaderList.push_back(shader3);

    // 3
    Shader *shader4 = new Shader();
    shader4->CreateFromFiles(LvShader, LfShader);
    shaderList.push_back(shader4);

    // 4
    Shader *shader5 = new Shader();
    shader5->CreateFromFiles(DvShader, DfShader);
    shaderList.push_back(shader5);

    // 5
    Shader *shader6 = new Shader();
    shader6->CreateFromFiles(DvShader, DfShader);
    shaderList.push_back(shader6);

    // 6
    Shader *shader7 = new Shader();
    shader7->CreateFromFiles(DvShader, DfShader);
    shaderList.push_back(shader7);

    // 7
    Shader *shader8 = new Shader();
    shader8->CreateFromFiles(DvShader, DfShader);
    shaderList.push_back(shader8);

    // 8
    Shader *shader9 = new Shader();
    shader9->CreateFromFiles(DvShader, DfShader);
    shaderList.push_back(shader9);

}

void checkMouse()
{
    float xoffset, yoffset;

    double xpos, ypos;
    glfwGetCursorPos(mainWindow.getWindow(), &xpos, &ypos);

    static float lastX = xpos;
    static float lastY = ypos;

    xoffset = xpos - lastX;
    yoffset = lastY - ypos;

    lastX = xpos;
    lastY = ypos;

    float sensitivity = 0.5f;
    xoffset *= sensitivity;
    yoffset *= sensitivity;

    yaw += xoffset;
    pitch += yoffset;

    if (pitch > 89)
        pitch = 89;
    if (pitch < -89)
        pitch = -89;
}

void RenderScene() {}

int main()
{
    mainWindow = Window(WIDTH, HEIGHT, 3, 3);
    mainWindow.initialise();

    CreateOBJ();
    CreateShaders();

    GLuint uniformModel = 0, uniformProjection = 0, uniformView = 0;

    glm::mat4 projection = glm::perspective(45.0f, (GLfloat)mainWindow.getBufferWidth() / (GLfloat)mainWindow.getBufferHeight(), 0.1f, 100.0f);

    glm ::vec3 cameraPos = glm::vec3(0, 0, 10);
    glm ::vec3 cameraTarget = glm::vec3(0.0f, 0.0f, -1.0f);
    glm ::vec3 cameraDirection = glm ::normalize(cameraTarget - cameraPos);

    glm ::vec3 up = glm::vec3(0.0f, 1.0f, 0.0f);
    glm ::vec3 cameraRight = glm ::normalize(glm::cross(cameraDirection, up));
    glm ::vec3 cameraUp = glm ::normalize(glm::cross(cameraRight, cameraDirection));

    float deltaTime, lastFrame;
    int width, height, nrChannels;

    /* Bass ----------------------------------------------------------- */
    
    unsigned char *data = stbi_load("Textures/bass.jpeg", &width, &height, &nrChannels, 0);
    unsigned int texture;
    glGenTextures(1, &texture);
    glBindTexture(GL_TEXTURE_2D, texture);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR_MIPMAP_LINEAR);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_REPEAT);
    if (data)
    {
        glTexImage2D(GL_TEXTURE_2D, 0, GL_RGB, width, height, 0, GL_RGB, GL_UNSIGNED_BYTE, data);
        glGenerateMipmap(GL_TEXTURE_2D);
    }
    else
    {
        std::cout << "Failed to load texture" << std::endl;
    }
    stbi_image_free(data);

    /* Bird ----------------------------------------------------------- */

    unsigned char *data1 = stbi_load("Textures/bird.png", &width, &height, &nrChannels, 0);
    unsigned int texture1;
    glGenTextures(1, &texture1);
    glBindTexture(GL_TEXTURE_2D, texture1);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR_MIPMAP_LINEAR);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_REPEAT);
    if (data1)
    {
        glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, width, height, 0, GL_RGBA, GL_UNSIGNED_BYTE, data1);
        glGenerateMipmap(GL_TEXTURE_2D);
    }
    else
    {
        std::cout << "Failed to load texture" << std::endl;
    }
    stbi_image_free(data1);

    /* AMP ----------------------------------------------------------- */
    
    unsigned char *data2 = stbi_load("Textures/amp.jpeg", &width, &height, &nrChannels, 0);
    unsigned int texture2;
    glGenTextures(1, &texture2);
    glBindTexture(GL_TEXTURE_2D, texture2);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR_MIPMAP_LINEAR);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_REPEAT);
    if (data2)
    {
        glTexImage2D(GL_TEXTURE_2D, 0, GL_RGB, width, height, 0, GL_RGB, GL_UNSIGNED_BYTE, data2);
        glGenerateMipmap(GL_TEXTURE_2D);
    }
    else
    {
        std::cout << "Failed to load texture" << std::endl;
    }
    stbi_image_free(data2);

    /* Background ----------------------------------------------------------- */

    unsigned char *data3 = stbi_load("Textures/wing.png", &width, &height, &nrChannels, 0);
    unsigned int texture3;
    glGenTextures(1, &texture3);
    glBindTexture(GL_TEXTURE_2D, texture3);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR_MIPMAP_LINEAR);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_REPEAT);
    if (data3)
    {
        glTexImage2D(GL_TEXTURE_2D, 0, GL_RGB, width, height, 0, GL_RGB, GL_UNSIGNED_BYTE, data3);
        glGenerateMipmap(GL_TEXTURE_2D);
    }
    else
    {
        std::cout << "Failed to load texture" << std::endl;
    }
    stbi_image_free(data3);

    /* Ground ----------------------------------------------------------- */

    unsigned char *data4 = stbi_load("Textures/wood.jpeg", &width, &height, &nrChannels, 0);
    unsigned int texture4;
    glGenTextures(1, &texture4);
    glBindTexture(GL_TEXTURE_2D, texture4);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR_MIPMAP_LINEAR);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_REPEAT);
    if (data4)
    {
        glTexImage2D(GL_TEXTURE_2D, 0, GL_RGB, width, height, 0, GL_RGB, GL_UNSIGNED_BYTE, data4);
        glGenerateMipmap(GL_TEXTURE_2D);
    }
    else
    {
        std::cout << "Failed to load texture" << std::endl;
    }
    stbi_image_free(data4);

    /* Wing ----------------------------------------------------------- */

    unsigned char *data5 = stbi_load("Textures/wing.png", &width, &height, &nrChannels, 0);
    unsigned int texture5;
    glGenTextures(1, &texture5);
    glBindTexture(GL_TEXTURE_2D, texture5);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR_MIPMAP_LINEAR);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_REPEAT);
    if (data5)
    {
        glTexImage2D(GL_TEXTURE_2D, 0, GL_RGB, width, height, 0, GL_RGB, GL_UNSIGNED_BYTE, data5);
        glGenerateMipmap(GL_TEXTURE_2D);
    }
    else
    {
        std::cout << "Failed to load texture" << std::endl;
    }
    stbi_image_free(data5);

    /* note ----------------------------------------------------------- */

    unsigned char *data6 = stbi_load("Textures/purple.png", &width, &height, &nrChannels, 0);
    unsigned int texture6;
    glGenTextures(1, &texture6);
    glBindTexture(GL_TEXTURE_2D, texture6);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR_MIPMAP_LINEAR);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_REPEAT);
    if (data6)
    {
        glTexImage2D(GL_TEXTURE_2D, 0, GL_RGB, width, height, 0, GL_RGB, GL_UNSIGNED_BYTE, data6);
        glGenerateMipmap(GL_TEXTURE_2D);
    }
    else
    {
        std::cout << "Failed to load texture" << std::endl;
    }
    stbi_image_free(data6);


    // Loop until window closed
    while (!mainWindow.getShouldClose())
    {
        float currentFrame = glfwGetTime();
        deltaTime = currentFrame - lastFrame;
        lastFrame = currentFrame;
        // Get + Handle user input events
        glfwPollEvents();

        if (glfwGetKey(mainWindow.getWindow(), GLFW_KEY_W) == GLFW_PRESS)
            cameraPos += cameraDirection * deltaTime * 3.0f;
        if (glfwGetKey(mainWindow.getWindow(), GLFW_KEY_S) == GLFW_PRESS)
            cameraPos -= cameraDirection * deltaTime * 3.0f;
        if (glfwGetKey(mainWindow.getWindow(), GLFW_KEY_A) == GLFW_PRESS)
            cameraPos -= cameraRight * deltaTime * 3.0f;
        if (glfwGetKey(mainWindow.getWindow(), GLFW_KEY_D) == GLFW_PRESS)
        {
            cameraPos += cameraRight * deltaTime * 3.0f;
        }
        checkMouse();
        glm::vec3 direction;
        direction.x = cos(glm ::radians(pitch)) * cos(glm::radians(yaw));
        direction.y = sin(glm ::radians(pitch));
        direction.z = cos(glm ::radians(pitch)) * sin(glm::radians(yaw));
        cameraDirection = glm ::normalize(direction);
        cameraRight = glm ::normalize(glm::cross(cameraDirection, up));
        cameraUp = glm ::normalize(glm::cross(cameraRight, cameraDirection));
        glm ::vec3 lightPos = glm ::vec3(0, 10, 0);

        // Clear window
        glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

        // draw here
        shaderList[0]->UseShader();
        uniformModel = shaderList[0]->GetUniformLocation("model");
        uniformProjection = shaderList[0]->GetUniformLocation("projection");
        uniformView = shaderList[0]->GetUniformLocation("view");

        glm::vec3 Positions[] =
            {
                glm::vec3(0.0f, 0.0f, -2.5f),
                glm::vec3(0.0f, 1.0f, 10.0f),
                glm::vec3(0.0f, -11.0f, -2.5f),
                glm::vec3(-3.8f, -2.0f, -12.3f),
                glm::vec3(2.4f, -0.4f, -3.5f),
                glm::vec3(-1.7f, 3.0f, -7.5f),
                glm::vec3(1.3f, -2.0f, -2.5f),
                glm::vec3(1.5f, 2.0f, -2.5f),
                glm::vec3(1.5f, 0.2f, -1.5f),
                glm::vec3(-1.3f, 1.0f, -1.5f)};

        glm ::mat4 view(1.0f);
        
        view = glm ::lookAt(cameraPos, cameraPos + cameraDirection, cameraUp);

        // Object
        /* Bass ----------------------------------------------------------- */

        glm::mat4 model(1.0f);
        model = glm::scale(model, glm::vec3(0.8f, 0.8f, 1.0f));
        glUniformMatrix4fv(uniformModel, 1, GL_FALSE, glm::value_ptr(model));
        glUniformMatrix4fv(uniformProjection, 1, GL_FALSE, glm::value_ptr(projection));
        glUniformMatrix4fv(uniformView, 1, GL_FALSE, glm::value_ptr(view));

        glUniform3fv(shaderList[0]->GetUniformLocation("lightColour"), 1, (GLfloat *)&lightColour);
        glUniform3fv(shaderList[0]->GetUniformLocation("lightPos"), 1, (GLfloat *)&lightPos);
        glActiveTexture(GL_TEXTURE0);
        glBindTexture(GL_TEXTURE_2D, texture);
        meshList[0]->RenderMesh();

        /* Bird ----------------------------------------------------------- */

        shaderList[1]->UseShader();
        uniformModel = shaderList[1]->GetUniformLocation("model");
        uniformProjection = shaderList[1]->GetUniformLocation("projection");
        uniformView = shaderList[1]->GetUniformLocation("view");

        glUniformMatrix4fv(uniformModel, 1, GL_FALSE, glm::value_ptr(model));
        glUniformMatrix4fv(uniformProjection, 1, GL_FALSE, glm::value_ptr(projection));
        glUniformMatrix4fv(uniformView, 1, GL_FALSE, glm::value_ptr(view));
        glUniform3fv(shaderList[1]->GetUniformLocation("lightColour"), 1, (GLfloat *)&lightColour);
        glUniform3fv(shaderList[1]->GetUniformLocation("lightPos"), 1, (GLfloat *)&lightPos);

        glActiveTexture(GL_TEXTURE0);
        glBindTexture(GL_TEXTURE_2D, texture1);
        bird->RenderMesh();

        /* AMP ----------------------------------------------------------- */

        shaderList[2]->UseShader();
        uniformModel = shaderList[2]->GetUniformLocation("model");
        uniformProjection = shaderList[2]->GetUniformLocation("projection");
        uniformView = shaderList[2]->GetUniformLocation("view");

        glUniformMatrix4fv(uniformModel, 1, GL_FALSE, glm::value_ptr(model));
        glUniformMatrix4fv(uniformProjection, 1, GL_FALSE, glm::value_ptr(projection));
        glUniformMatrix4fv(uniformView, 1, GL_FALSE, glm::value_ptr(view));
        glUniform3fv(shaderList[2]->GetUniformLocation("lightColour"), 1, (GLfloat *)&lightColour);
        glUniform3fv(shaderList[2]->GetUniformLocation("lightPos"), 1, (GLfloat *)&lightPos);

        glActiveTexture(GL_TEXTURE0);
        glBindTexture(GL_TEXTURE_2D, texture2);
        amp->RenderMesh();

        /* Light ----------------------------------------------------------- */
        
        shaderList[3]->UseShader();
        uniformModel = shaderList[3]->GetUniformLocation("model");
        uniformProjection = shaderList[3]->GetUniformLocation("projection");
        uniformView = shaderList[3]->GetUniformLocation("view");

        glUniformMatrix4fv(uniformModel, 1, GL_FALSE, glm::value_ptr(model));
        glUniformMatrix4fv(uniformProjection, 1, GL_FALSE, glm::value_ptr(projection));
        glUniformMatrix4fv(uniformView, 1, GL_FALSE, glm::value_ptr(view));
        glUniform3fv(shaderList[3]->GetUniformLocation("lightColour"), 1, (GLfloat *)&lightColour);
        glUniform3fv(shaderList[3]->GetUniformLocation("lightPos"), 1, (GLfloat *)&lightPos);
        glActiveTexture(GL_TEXTURE0);

        light->RenderMesh();

        /* Background ----------------------------------------------------------- */

        shaderList[6]->UseShader();
        uniformModel = shaderList[6]->GetUniformLocation("model");
        uniformProjection = shaderList[6]->GetUniformLocation("projection");
        uniformView = shaderList[6]->GetUniformLocation("view");

        glUniformMatrix4fv(uniformModel, 1, GL_FALSE, glm::value_ptr(model));
        glUniformMatrix4fv(uniformProjection, 1, GL_FALSE, glm::value_ptr(projection));
        glUniformMatrix4fv(uniformView, 1, GL_FALSE, glm::value_ptr(view));
        glUniform3fv(shaderList[6]->GetUniformLocation("lightColour"), 1, (GLfloat *)&lightColour);
        glUniform3fv(shaderList[6]->GetUniformLocation("lightPos"), 1, (GLfloat *)&lightPos);

        glActiveTexture(GL_TEXTURE0);
        glBindTexture(GL_TEXTURE_2D, texture3);
        bg->RenderMesh();

        /* Ground ----------------------------------------------------------- */

        shaderList[4]->UseShader();
        uniformModel = shaderList[4]->GetUniformLocation("model");
        uniformProjection = shaderList[4]->GetUniformLocation("projection");
        uniformView = shaderList[4]->GetUniformLocation("view");

        glUniformMatrix4fv(uniformModel, 1, GL_FALSE, glm::value_ptr(model));
        glUniformMatrix4fv(uniformProjection, 1, GL_FALSE, glm::value_ptr(projection));
        glUniformMatrix4fv(uniformView, 1, GL_FALSE, glm::value_ptr(view));
        glUniform3fv(shaderList[4]->GetUniformLocation("lightColour"), 1, (GLfloat *)&lightColour);
        glUniform3fv(shaderList[4]->GetUniformLocation("lightPos"), 1, (GLfloat *)&lightPos);
        glActiveTexture(GL_TEXTURE0);
        glBindTexture(GL_TEXTURE_2D, texture4);
        ground->RenderMesh();
         
        /*  Wing ----------------------------------------------------------- */

        shaderList[5]->UseShader();
        uniformModel = shaderList[5]->GetUniformLocation("model");
        uniformProjection = shaderList[5]->GetUniformLocation("projection");
        uniformView = shaderList[5]->GetUniformLocation("view");

        glUniformMatrix4fv(uniformModel, 1, GL_FALSE, glm::value_ptr(model));
        glUniformMatrix4fv(uniformProjection, 1, GL_FALSE, glm::value_ptr(projection));
        glUniformMatrix4fv(uniformView, 1, GL_FALSE, glm::value_ptr(view));
        glUniform3fv(shaderList[5]->GetUniformLocation("lightColour"), 1, (GLfloat *)&lightColour);
        glUniform3fv(shaderList[5]->GetUniformLocation("lightPos"), 1, (GLfloat *)&lightPos);
        glActiveTexture(GL_TEXTURE0);
        glBindTexture(GL_TEXTURE_2D, texture5);
        wing->RenderMesh();
        
        /* Note ----------------------------------------------------------- */

        shaderList[7]->UseShader();
        uniformModel = shaderList[7]->GetUniformLocation("model");
        uniformProjection = shaderList[7]->GetUniformLocation("projection");
        uniformView = shaderList[7]->GetUniformLocation("view");

        glUniformMatrix4fv(uniformModel, 1, GL_FALSE, glm::value_ptr(model));
        glUniformMatrix4fv(uniformProjection, 1, GL_FALSE, glm::value_ptr(projection));
        glUniformMatrix4fv(uniformView, 1, GL_FALSE, glm::value_ptr(view));
        glUniform3fv(shaderList[7]->GetUniformLocation("lightColour"), 1, (GLfloat *)&lightColour);
        glUniform3fv(shaderList[7]->GetUniformLocation("lightPos"), 1, (GLfloat *)&lightPos);
        glActiveTexture(GL_TEXTURE0);
        glBindTexture(GL_TEXTURE_2D, texture6);
        note->RenderMesh();

        glUseProgram(0);

        // end draw
        mainWindow.swapBuffers();
    }

    return 0;
}
