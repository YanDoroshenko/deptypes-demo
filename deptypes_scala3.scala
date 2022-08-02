import scala.compiletime.ops.int.*

trait Vector[N <: Int, T]

case class Nil[T]() extends Vector[0, T]

case class Cons[N <: Int, T](h: T, t: Vector[N, T]) extends Vector[N + 1, T]


case class Matrix[N <: Int, M <: Int, A](m: Vector[N, Vector[M, A]])

def multiply[N <: Int, M <: Int, P <: Int, A](m1: Matrix[N, M, A], m2: Matrix[M, P, A]): Matrix[N, P, A] = null


val m1: Matrix[3, 2, Int] = Matrix(
    Cons(Cons(1, Cons(2, Nil[Int]())),
        Cons(Cons(3, Cons(4, Nil[Int]())),
            Cons(Cons(5, Cons(6, Nil[Int]())),
                Nil[Vector[2, Int]]())
            )
        )
    )

val m2: Matrix[2, 1, Int] = Matrix(
    Cons(Cons(7, Nil[Int]()),
        Cons(Cons(8, Nil[Int]()),
            Nil[Vector[1, Int]]())
        )
    )
