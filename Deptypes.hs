{-# LANGUAGE TypeInType #-}
{-# LANGUAGE TypeOperators #-}
{-# LANGUAGE GADTs #-}

module Matrix where

import Data.Kind

data Nat :: Type where
  Z :: Nat
  S :: Nat -> Nat

data Vector :: Nat -> Type -> Type where
  Nil :: Vector Z a
  (:|) :: a -> Vector x a -> Vector (S x) a

infixr 5 :|


data Matrix n m a = Matrix (Vector n (Vector m a))

multiply :: Matrix n m a -> Matrix m p a -> Matrix n p a
multiply _ _ = undefined

m1 :: Matrix (S (S (S Z))) (S (S Z)) Int
m1 = Matrix $
  (1 :| 2 :| Nil) :|
  (3 :| 4 :| Nil) :|
  (5 :| 6 :| Nil) :|
  Nil

m2 :: Matrix (S (S Z)) (S Z) Int
m2 = Matrix $
  (7 :| Nil) :|
  (8 :| Nil) :|
  Nil

--m3 :: Matrix 2 1 Int
--m3 = Matrix $
--  (7 :| Nil) :|
--  (8 :| Nil) :|
--  Nil

instance Show (Matrix n m a) where
  show _ = ""
