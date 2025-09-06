#version 150

#moj_import <fog.glsl>

uniform sampler2D Sampler0;

in float vertexDistance;
in vec4 vertexColor;
in vec2 texCoord0;

out vec4 fragColor;

void main() {
    vec4 color = texture(Sampler0, texCoord0) * vertexColor;

    if (color.a < 0.1) discard;

    color.rgb = max(color.rgb, vec3(0.0));
    fragColor = vec4(color.rgb, color.a);
}