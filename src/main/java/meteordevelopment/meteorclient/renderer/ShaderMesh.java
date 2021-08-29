/*
 * This file is part of the Dog Client distribution (https://github.com/MeteorDevelopment/meteor-client/).
 * Copyright (c) 2021 Dog Development.
 */

package meteordevelopment.meteorclient.renderer;

public class ShaderMesh extends Mesh {
    private final Shader shader;

    public ShaderMesh(Shader shader, DrawMode drawMode, Attrib... attributes) {
        super(drawMode, attributes);

        this.shader = shader;
    }

    @Override
    protected void beforeRender() {
        shader.bind();
    }
}
