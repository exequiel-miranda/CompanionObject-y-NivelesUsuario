En Kotlin, un companion object es un objeto único declarado dentro de una clase que permite acceder a sus miembros (propiedades y funciones) directamente a través de la clase sin necesidad de crear una instancia de esta. Actúa como un miembro estático en lenguajes como Java. </br>
En otras palabras, nos servirá para colocar variables y funciones de manera global, de tal manera que podamos acceder a todo lo que esté dentro del companion object desde cualquier lugar del código de nuestra aplicación (clase de conexión, clases de activitys, fragments, adaptadores etc.)</br>

Pantallas que contiene este proyecto: </br>
Un login y un Bottom Navigation</br>
![image](https://github.com/exequiel-miranda/CompanionObject-y-NivelesUsuario/assets/94820436/60e6adcb-90f9-47e4-a4d2-579e2a0b20e3)
![image](https://github.com/exequiel-miranda/CompanionObject-y-NivelesUsuario/assets/94820436/03ead085-3fcb-4267-b28b-33e0cf66e0d7)

</br>
Entonces, usando un companion Object vamos a colocar una variable que almacene el correo que el usuario escribe</br>
Y como esta variable estará dentro del companion Object, podremos acceder desde cualquier lugar de nuestro proyecto a esa variable.</br>

![image](https://github.com/exequiel-miranda/CompanionObject-y-NivelesUsuario/assets/94820436/0b324683-ad5a-4f1c-878f-47993f945443)</br>


Vean como le coloco un nombre al companion Object, y dentro de el, una lateinit var llamada correoIngresado</br>
Recuerden que una lateinit var es una variable que declaro pero que no le asigno un valor en el momento de declararla, sino que le defino un valor después</br>

Por ejemplo, yo le defino el valor al darle clic al boton ingresar:</br>
![image](https://github.com/exequiel-miranda/CompanionObject-y-NivelesUsuario/assets/94820436/f798ef70-3e74-4651-a6f0-0a37bd5d1905)</br>
Vean como el valor que tendrá esta variable global es lo que el usuario escribió en el cuadrito de texto para el correo</br>
(y luego hago un intent para cargar el Bottom Navigation)</br>



## ¿Como accedo a variables del companion object que declaré en el login?</br>

Como ahora el correo es una variable global, quiero acceder a ella y mostrar su valor en el fragment de Notificaciones y colocarlo en un TextView</br>
![image](https://github.com/exequiel-miranda/CompanionObject-y-NivelesUsuario/assets/94820436/e86abf77-fd55-4cb4-ad1b-5efe8733c319)

</br>
Noten como luego de mandar a traer el correo que es global, llamo al textView que tenia en la pantalla y le asigno como valor el correo que traje para que lo muestre
Por ejemplo, si el usuario escribe "pepito@gmail.com" en el correo</br>
Ese correo se guarda de manera global</br>
Luego mando a traer esa variable global</br>
Y muestro esa variable global</br>




