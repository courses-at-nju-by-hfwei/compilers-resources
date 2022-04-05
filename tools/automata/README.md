# Tools for Automata


## Simulators
- [FSM simulator](http://ivanzuzak.info/noam/webapps/fsm_simulator/)
  - Visually simulate your DFAs, NFAs and ε-NFAs, one input symbol at a time!

- [Automata Simulator](https://automatonsimulator.com/)

- [caleb531/automata](https://github.com/caleb531/automata)
  - A Python library for simulating finite automata, pushdown automata, and Turing machines

- [CoAn - Compiler and Automaton Network Simulator](https://www.elstel.org/coan/index.html.en)
  > Full-fledged automaton simulator which can run finite automata, pushdown automata,
  Turing machines and machine schemata for deterministic and non-deterministic automata
  (all simultaneously active states are shown in light yellow).
  Non-deterministic pushdown automata are shown with all possible stack contents
  for a certain activation.
  Use machine schemata to create and simulate more complicated Turing machines.
  Clear tree structure to view, execute and safe different automata within a single file.

  > Hint: Open Test2.atm to get a few examples. If the windows executables should not run then copy `ucrtbased.dll` into the `coan-2.0-exe` directory.

## Generators
- [cyberzhg.github.io/toolbox](https://cyberzhg.github.io/toolbox/)
  - Regex => NFA; Regex => NFA => DFA; Regex => NFA => DFA => Min-DFA
  - Left factoring; Left recursion
  - CFG => LL(k); CFG => CNF; First & Follow
  - LR(0)/SLR(1); LR(1); LALR
  - CYK

## Comprehensive Tools
- [JFLAP (JFLAP7.1; July 2018)](http://www.jflap.org/)
  - [Visual and Interactive Tools; (Susan H. Rodger)](https://users.cs.duke.edu/~rodger/tools/tools.html)
  > `JFLAP` is software for experimenting with formal languages topics
  including nondeterministic finite automata, nondeterministic pushdown automata,
  multi-tape Turing machines, several types of grammars, parsing, and L-systems.
  In addition to constructing and testing examples for these,
  `JFLAP` allows one to experiment with construction proofs from one form to another,
  such as converting an NFA to a DFA to a minimal state DFA to a regular expression
  or regular grammar.

- [GOAL (Version 2020-05-06)](http://goal.im.ntu.edu.tw/wiki/doku.php)
  > `GOAL` is a graphical interactive tool for
  defining and manipulating Büchi automata and temporal logic formulae.
  The acronym `GOAL` was originally derived from "Graphical Tool
  for Omega-Automata and Logics".
  It also stands for "Games, Omega-Automata, and Logics",
  as we gradually add support for omega-regular games.