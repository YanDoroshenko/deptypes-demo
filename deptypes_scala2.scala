sealed trait Nat

case object Z extends Nat
case class S[N <: Nat]() extends Nat


sealed trait Vector[N <: Nat, T]

case class Nil[T]() extends Vector[Z.type, T]
case class Cons[N <: Nat, T](h: T, t: Vector[N, T]) extends Vector[S[N], T]


case class Matrix[N <: Nat, M <: Nat, A](matrix: Vector[N, Vector[M, A]])

def multiply[N <: Nat, M <: Nat, P <: Nat, T](m1: Matrix[N, M, T], m2: Matrix[M, P, T]): Matrix[N, P, T] = null


val m1: Matrix[S[S[S[Z.type]]], S[S[Z.type]], Int] = Matrix(
    Cons(Cons(1, Cons(2, Nil[Int]())),
        Cons(Cons(3, Cons(4, Nil[Int]())),
            Cons(Cons(5, Cons(6, Nil[Int]())),
                Nil[Vector[S[S[Z.type]], Int]]())
            )
        )
    )

val m2: Matrix[S[S[Z.type]], S[Z.type], Int] = Matrix(
    Cons(Cons(7, Nil[Int]()),
        Cons(Cons(8, Nil[Int]()),
            Nil[Vector[S[Z.type], Int]]())
        ))

