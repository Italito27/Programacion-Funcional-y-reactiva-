/*
Programación Funcional y Reactiva
Trabajo de consulta
Higher Order Functions
------------------------------------------------------------------------------------
Objetivos:
- Aplicar los conocimientos sobre funciones de orden superior.
- Enviar una función como parámetro.

------------------------------------------------------------------------------------
Descripción:
Uno de los métodos de integración numérica se denomina como Simpson 1/3. Ese
método estable lo siguiente:

 */

//DESARROLLO


//Metodo de integracion
//Regla de simpson
def integracion(num:Double => Double, a: Int, b: Int): Double = {

  val x1 = (a + b) / 2
  ((b - a) * (num(a) + 4 * num(x1) + num(b)) / 6)

}

/*
integracion → recibe 3 parametros
 a representa al límite inferior de la integral
 b representa el límite superior de la integral
*/

def maergenErr(x: Double, y: Double) = Math.abs(x - y)
/*
recibe 2 parametros
Math.abs devuelve un valor absoluto
*/



// Ejercicios 2


//Ejercicio 1
val fx = (x: Double) => - Math.pow(x, 2) + 8 * x - 12
val aproximacion = integracion(fx,3,5)
val err = maergenErr(7.33, aproximacion)

// Ejercicio 2

val fx1 = (x : Double) => 3 * math.pow(x, 2)
val aproximacion1 = integracion(fx1,0,2)
val err1 = maergenErr(8, aproximacion)

// Ejercicio 3

val fx2 = (x: Double) =>  x + 2 * math.pow(x, 2) - math.pow(x, 3) + 5 * math.pow(x, 4)
val aproximacion2 = integracion(fx2,-1,1)
val err2 = maergenErr(3.333, aproximacion)

// Ejercicio 4

val fx3 = (x: Double) =>  (2*x + 1) / math.pow(x,2) + x
val aproximacion3 = integracion(fx3,1,2)
val err3 = maergenErr(1.09861, aproximacion)

// Ejercicio 5

val fx4 = (x: Double) => math.pow(math.E, x)
val aproximacion4 = integracion(fx4,0,1)
val err4 = maergenErr(1.71828, aproximacion) 7

// Ejercicio 6

val fx5 = (x: Double) => 1 / math.sqrt(x-1)
val aproximacion5 = integracion(fx5,2,3)
val err5 = maergenErr(0.828427, aproximacion)

// Ejercicio 7

val fx6 = (x: Double) => 1 / 1 + math.pow(x,2)
val aproximacion6 = integracion(fx6,0,1)
val err6 = maergenErr(0.785398, aproximacion)

