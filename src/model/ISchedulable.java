package model;

import java.util.Date;
//Interface: Son un tipo de referencia similar a una clase con solo constantes y definiciones de métodos. No llevan código implementado.
//Son de gran ayuda para definir comportamientos redundantes y poder reutilizar más de una clase, incluso cuando tenemos muchas clases y no todas pertenecen a la misma familia.
//Las interfaces establecen la forma de las clases que la implementan, así como sus nombres de métodos, listas de argumentos y listas de retorno, pero NO sus bloques de código,
//eso es responsabilidad de cada clase.

/*
    Composición de interfaces en Clases: Abstraer todos los métodos/comportamientos de una clase para modularizarlos(comprimirlos, encapsularlos) en una interfaz y reutilizar su código
    en diferentes clases.

    Las interfaces se crean utilizando la palabra reservada interface y se implementan en nuestras clases con implements.
    Recuerda que podemos heredar(implementar) más de una interfaz, pero no podemos hacerlo de las clases padres o superclases.

 */
public interface ISchedulable {
    void schedule(Date date, String time);

}
