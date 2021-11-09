Star Wars API
=======================

* Nombre: Jesús Rojas Monge.
* Carnet: 2015023095.



Aplicación para obtener informacion sobre StarWars mediante una API ( https://swapi.dev/api/ )


###Opciones de compilación:
######NOTA: La ejecución del programa hace uso de Apache Maven ( https://maven.apache.org/ )


```bash
mvn clean install
```

 Actualmente se pueden hacer consultas de personas y planetas

```bash
mvn exec:java -Dexec.args="people 1"

mvn exec:java -Dexec.args="planet 1"
```


######NOTA: Cambie el numero de objeto a consultar.


## Evaluacion

Nota 10
