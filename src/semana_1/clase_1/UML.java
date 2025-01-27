
package clase_1;

// UML : Lenguaje Unificado de Modelado.
/*
--------------------------------------------
|            Clase Nombre_Clase             |
--------------------------------------------
| - atributo1: tipoA                        |
| - atributo2: tipoB                        |
--------------------------------------------
| + metodo1(parametro1: tipoC): tipoRetorno  |
| + metodo2(): void                         |
--------------------------------------------

NIVELES DE ENCAPSULAMIENTO:
+  Público
-  Privado
#  Protegido

RELACIONES:
- Asociación  __    Línea (A pertenece a B)
- Agregación  -o    Línea y un rombo vacio (A es parte de B)       
- Composición -*    Línea y un rombo con relleno. (Similar a agregación pero relación mas fuerte)
- Herencia    --|>  Línea y triangulo vacio (A es de B)
- Dependencia ..>   Línea discontinua y un > (A requiere a B)
*/


public class UML
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

