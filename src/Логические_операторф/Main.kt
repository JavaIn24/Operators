package Логические_операторф
const val PI = 3.14
fun main(){
    val a = 4;
    val per = a*4;
    val s = a*a;

    val a1 = 16;
    val b1 = 10;
    val p1 = (a1 + b1) * 2;
    val s1 = a1 *b1;

    val d = 5;
    val l : Double = PI * d;

    val l1 = 465;
    val metr = l1 / 100;

    val a2 = 150;
    val b2 = 31;
    val c2 = a2 / b2;

    println("P квадрата = $per | S квадрата = $s" +
            " | P прямоугольника = $p1" +
            " | S прямоугольника = $s1" +
    " | Длина окружности = $l | L = $metr | A = $c2" )
}