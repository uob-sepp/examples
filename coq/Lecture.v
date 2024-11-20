
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
Proof.
intro n.
simpl.
reflexivity.
Qed.

Theorem add_right_identity :
  forall n : Nat, add n Zero = n.
Proof.
intro n.
induction n.
simpl.
reflexivity.
simpl.
rewrite IHn.
reflexivity.
Qed.

Theorem add_associativity :
  forall x y z : Nat, add x (add y z) = add (add x y) z.
Proof.
intros.
induction x.
simpl.
reflexivity.
simpl.
rewrite IHx.
reflexivity.
Qed.

Require Extraction.
Extraction Language Haskell.
Extraction add.


