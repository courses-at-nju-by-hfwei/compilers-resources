# RISC-V

## Official
- [RISC-V International](https://riscv.org/)
  - [RISC-V Software @ github](https://github.com/riscv-software-src)
	- [RISC-V Collaboration @ github](https://github.com/riscv-collab)
	  > RISC-V: The Free and Open RISC Instruction Set Architecture
- [RISC-V @ wiki](https://en.wikipedia.org/wiki/RISC-V)
- [SiFive](https://www.sifive.com/)
 - [SiFive @ wiki](https://en.wikipedia.org/wiki/SiFive)

## Software
### Toolchains
- [riscv-gnu-toolchain @ github](https://github.com/riscv-collab/riscv-gnu-toolchain)
  - [johnwinans / riscv-toolchain-install-guide @ github](https://github.com/johnwinans/riscv-toolchain-install-guide)
- [riscv-software-src / riscv-tools @ github](https://github.com/riscv-software-src/riscv-tools)
  > RISC-V Tools (ISA Simulator and Tests)

### IDEs and Emulators
- [SiFive Freedom Studio @ SiFive](https://www.sifive.com/software)
  - [sifive / freedom-studio (Releases) @ github](https://github.com/sifive/freedom-studio/releases)
  - [RISC V 15 minute sample course @ Youtube](https://youtu.be/KBvAKHsHBW4)
    > It explains how to use Freedom Studio and QEMU.
- [PlatformIO @ github](https://github.com/platformio)
  > A professional collaborative platform for embedded development 👽
- [RISC-V Support @ VSCode Plugin](https://marketplace.visualstudio.com/items?itemName=zhwu95.riscv)
  > sudo apt install clang lld
  > clang --target=riscv32 -march=rv32gc -mabi=ilp32d -mno-relax hello.s -c -o hello.o
  > ld.lld hello.o -o hello.x
- [Spike RISC-V ISA Simulator @ github](https://github.com/riscv-software-src/riscv-isa-sim)
- [QEMU](https://www.qemu.org/)
  > A generic and open source machine emulator and virtualizer
  - [Docs for QEMU](https://www.qemu.org/docs/master/index.html)
  - [RISC-V System emulator](https://www.qemu.org/docs/master/system/target-riscv.html#:~:text=QEMU%20can%20emulate%20both%2032-bit%20and%2064-bit%20RISC-V,qemu-system-riscv32%20executable%20to%20simulate%20a%2032-bit%20RISC-V%20machine.)
  - [QEMU Binaries for Windows (64 bit)](https://qemu.weilnetz.de/w64/)
  - [QEMU is packaged by most Linux distributions](https://www.qemu.org/download/#linux)
    > sudo apt install qemu
	- [Enabling RISC-V Development with QEMU @ Youtube](https://youtu.be/xlb6g8w01fc)
- [johnwinans / rvddt (RISC-V Dynamic Debugging Tool) @ github](https://github.com/johnwinans/rvddt)
- [RISC-V Interpreter @ cs.cornell.edu](https://www.cs.cornell.edu/courses/cs3410/2019sp/riscv/interpreter/)
- [Venus Simulator](https://venus.kvakil.me/)
- [mortbopet / Ripes @ github](https://github.com/mortbopet/Ripes)
  > A graphical processor simulator and assembly editor for the RISC-V ISA
- [RISC-V ALE (RISC-V Assembly Learning Environment)](https://riscv-programming.org/ale/)
  - [Assembling RISC-V programs with Colab](https://colab.research.google.com/drive/1PM-3ulMFqeo4Ce2hIwir3IftcWyQ0SMh?usp=sharing)

## Tutorials

### Manuals
- [riscv-non-isa / riscv-asm-manual @ github](https://github.com/riscv-non-isa/riscv-asm-manual/blob/master/riscv-asm.md)
### Books
- [johnwinans / rvalp @ github](https://github.com/johnwinans/rvalp)
  - An excellent book (with LaTeX source code)
- [An Introduction to Assembly Programming with RISC-V](https://riscv-programming.org/book/riscv-book.html)
  - On Programming (instead of instructions only!!!)
- [The RISC-V Reader @ Amazon]()

### Websites
- [RISC-V Guru](https://risc-v.guru/)

### ISA Cheatsheet
- [RISC-V Instruction-Set Cheatsheet by Erik Engheim 20220516](https://itnext.io/risc-v-instruction-set-cheatsheet-70961b4bbe8)

### Videos
- [RISC-V Lectures (John's Basement) @ Youtube](https://youtube.com/playlist?list=PL3by7evD3F53Dz2RiB47Ztp9l_piGVuus)
  - An excellent introduction
- [CSCI 463: Computer Architecture and Systems Organization Fall 2022
Course Information](https://faculty.cs.niu.edu/~winans/CS463/2022-fa/)
	- [Spring 2021 NIU CSCI 463 (John's Basement) @ Youtube](https://www.youtube.com/playlist?list=PL3by7evD3F50NMukhaMqNdOt4pUHXT2Vo)
		- Lectures 29 ~ 32

### General Videos
- [RISC-V is the future of computing by Chris Lattner and Lex Fridman](https://www.bilibili.com/video/BV1S8411K77G/?share_source=copy_web&vd_source=afddc1f6e07c3046ed07519aa34370fd)
- [ASPLOS Keynote: The Golden Age of Compiler Design in an Era of HW_SW Co-design b](https://www.bilibili.com/video/BV1hD4y1V77j/?share_source=copy_web&vd_source=afddc1f6e07c3046ed07519aa34370fd)

## Chips
- [WikiChip](https://en.wikichip.org/wiki/WikiChip)

## LLVM
- [User Guide for RISC-V Target @ LLVM Docs](https://llvm.org/docs/RISCVUsage.html)
- [Using Clang to compile for RISC-V @ StackOverflow](https://stackoverflow.com/questions/68580399/using-clang-to-compile-for-risc-v)
- [How can I compile with LLVM/Clang to RISC-V target @ StackOverflow](https://stackoverflow.com/questions/54670887/how-can-i-compile-with-llvm-clang-to-risc-v-target)
  > llvm-objdump --version | grep riscv
  > clang --target=riscv64 -march=rv64gc rotate.s -c -o rotate.o
  > file rotate.o

## RISC-V Assembly Language

- [RISC-V Assembly Code Examples by Erik Engheim](https://erik-engheim.medium.com/risc-v-assembly-code-examples-7bca0e7ebaa3)
- [RISC-V Assembly for Beginners by Erik Engheim](https://medium.com/swlh/risc-v-assembly-for-beginners-387c6cd02c49)
- [RISC-V Assembler Reference](https://michaeljclark.github.io/asm.html)
  > This document gives an overview of RISC-V assembly language. First, an introduction to assembler and linker concepts, then sections describing assembler directives, pseudo- instructions, relocation functions, and assembler concepts such as labels, relative and absolute addressing, immediate values, constants and finally control and status registers.