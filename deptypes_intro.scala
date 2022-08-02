def f(x: Int) = x + 1





type X[T] = Option[T]

val a: X[Int] = Some(1)





type ListOfSize[n] = ???





type PositiveInt = Int Refined Positive

def nthElement[T](xs: Seq[T])(n: PositiveInt): T

nthElement(Seq(1, 2, 3))(-1) // Compilation error




val matrix1 = Seq(
    Seq(1, 2, 3),
    Seq(2, 3, 4)
)

val matrix2 = Seq(
    Seq(5),
    Seq(7),
    Seq(9)
)

val matrixRes = Seq(
    Seq(46),
    Seq(67)
)

def multiply(m1: Seq[Seq[Int]], m2: Seq[Seq[Int]])
