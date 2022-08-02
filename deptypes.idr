import Data.Vect

Matrix : Nat -> Nat -> Type -> Type
Matrix n m a = Vect n (Vect m a)

multiply : Num a => Matrix n m a -> Matrix m p a -> Matrix n p a

x : Matrix 3 2 Int
x = [
  [1, 2],
  [3, 4],
  [5, 6]
]

y : Matrix 2 1 Int
y = [
  [7],
  [8]
];

z : Matrix 1 1 Int
z = [
  [9]
]

