
Inductive Nat
  := Zero : Nat
  | Succ : Nat -> Nat.

Fixpoint add n m :=
  match n with
   | Zero   => m
   | Succ x => Succ (add x m)
  end.

Theorem add_left_identity :
  forall n : Nat, add Zero n = n.


Theorem add_right_identity :
  forall n : Nat, add n Zero = n.


Theorem add_associativity :
  forall x y z : Nat, add x (add y z) = add (add x y) z.


