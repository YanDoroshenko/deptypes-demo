


f :: Int -> Int
f x = x + 1





type X t = Maybe t

a :: X Int
a = Just 1




type ListOfSize n = ???





type PositiveInt Refined Positive Int

nthElement :: [a] -> PositiveInt -> a

nthElement [1, 2, 3] (-5) -- Compilation error




matrix1 = [
  [1, 2, 3],
  [2, 3, 4]
          ]

matrix2 = [
  [5],
  [7],
  [9]
          ]

matrixRes = [
  [46],
  [67]
            ]

multiply :: [[Int]] -> [[Int]] -> [[Int]]

