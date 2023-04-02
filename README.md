# spring-boot-patterns-design
Características del buen diseño

Reutilización de código
El nivel de reutilización aumenta cuando pasas de clases a patrones y por último a frameworks.
Extensibilidad
El cambio es lo único constante en la vida de un programador. Por este motivo, todos los desarrolladores experimentados se preparan para posibles cambios futuros cuando diseñan la arquitectura de una aplicación.

 

Principios del diseño

Encapsula lo que varía. Identifica los aspectos de tu aplicación que varían y sepáralos de los que se mantienen inalterables. El objetivo principal de este principio es minimizar el efecto provocado por los cambios.
Programa a una interfaz, no a una implementación. Depende de abstracciones, no de clases concretas.
Favorece la composición sobre la herencia
Una subclase no puede reducir la interfaz de la superclase. Al sobrescribir métodos debes asegurarte de que el nuevo comportamiento sea compatible con el de base. La herencia rompe la encapsulación de la superclase. Las subclases están fuertemente acopladas a superclases. Intentar reutilizar código mediante la herencia puede conducir a la creación de jerarquías de herencia paralelas.

Existe una alternativa a la herencia llamada composición. Mientras que la herencia representa la relación “is a” (es un/ a) entre clases (un auto es un medio de transporte), la composición se basa en la relación “tiene un/a” (un auto tiene un motor)

 

Principios SOLID

Principio de responsabilidad única Single Responsibility Principle

Intenta hacer a cada clase responsable de una única parte de la funcionalidad proporcionada por el software, y haz que esa responsabilidad quede totalmente encapsulada por (también puedes decir escondida dentro de) la clase.

Principio de abierto/cerrado Open/Closed Principle

Las clases deben estar abiertas a la extensión pero cerradas a la modificación. La idea fundamental de este principio es evitar que el código existente se descomponga cuando implementas nuevas funciones. Puedes resolver el problema aplicando el patrón Strategy. Empieza extrayendo métodos de envío y colocándolos dentro de clases separadas con una interfaz común.

Principio de sustitución de Liskov Liskov Substitution Principle

Al extender una clase, recuerda que debes tener la capacidad de pasar objetos de las subclases en lugar de objetos de la clase padre, sin descomponer el código cliente