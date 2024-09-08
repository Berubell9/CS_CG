#version 330

out vec4 colour;
in vec4 vCol;
in vec2 TexCoord;
in vec3 Normal;

in vec3 FragPos;

uniform vec3 lightPos;
uniform vec3 viewPos;

uniform sampler2D texture2D;
uniform vec3 lightColour;


vec3 ambientLight(){
    float ambientStrength = 0.5f;
    vec3 ambinet = ambientStrength * lightColour;
    return ambinet;
}

vec3 diffuseLight(){
    float diffuseStrength = 0.4f;
    vec3 norm = normalize(Normal);
    vec3 lightDir = normalize(lightPos - FragPos);

    float diff = max(dot(norm,lightDir),0); 
    vec3 diffuse = diffuseStrength * lightColour * diff;
    return diffuse;
}

vec3 specularLight(){
    float specularStrength = 1.0f;
    float shininess = 30.0f;
    vec3 norm = normalize(Normal);
    vec3 lightDir = normalize(lightPos - FragPos);
    vec3 viewDir = normalize(viewPos - FragPos);
    
    vec3 reflectDir = reflect(-lightDir, norm);
    //float spec = pow(max(dot(reflectDir, viewDir),0), shininess);

    vec3 halfDir = (lightDir + viewDir)/2.0f;
    float spec = pow(max(dot(halfDir, norm),0), shininess);
    
    vec3 specular = specularStrength * lightColour * spec;
    return specular;
}

void main()
{
    
    colour = texture(texture2D, TexCoord) * vec4(ambientLight() + diffuseLight() + specularLight(), 1.0f);
    
}