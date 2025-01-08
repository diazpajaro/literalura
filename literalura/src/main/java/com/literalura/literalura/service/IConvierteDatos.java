package com.literalura.literalura.service;

public interface IConvierteDatos {

    <T> T obtenerDatos(String Json, Class<T> clase);
}
