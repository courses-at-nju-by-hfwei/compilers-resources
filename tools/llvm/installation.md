# installation

- [Requirements](https://llvm.org/docs/GettingStarted.html#software) and [toolchain](https://llvm.org/docs/GettingStarted.html#host-c-toolchain-both-compiler-and-standard-library)
> As such, we require a modern host C++ toolchain, both compiler and standard library, in order to build LLVM.
- install `clang`
	> `sudo apt install clang --fix-missing`

	- OR [build clang manually](https://clang.llvm.org/get_started.html)

> Note: I do *not* follow [getting a modern ost c toolchain](https://llvm.org/docs/GettingStarted.html#getting-a-modern-host-c-toolchain).

- `git clone https://github.com/llvm/llvm-project.git` On Ubuntu
- `git clone --config core.autocrlf=false https://github.com/llvm/llvm-project.git` On Windows

- `cd llvm`

- install [`lld`](https://lld.llvm.org/)
  > `cmake -S llvm -B build -G Ninja -DCMAKE_BUILD_TYPE=Debug -DLLVM_ENABLE_PROJECTS=lld -DCMAKE_CXX_COMPILER=clang++ -DCMAKE_C_COMPILER=clang -DLLVM_ENABLE_ASSERTIONS=ON -DLLVM_ENABLE_EH=ON -DLLVM_ENABLE_RTTI=ON`

	- See [local llvm configuration](https://llvm.org/docs/GettingStarted.html#local-llvm-configuration) for options

	> `cd build`

	> `sudo ninja install`

- `cd ..`

- generate `build/`
  > `cmake -S llvm -B build -G Ninja -DCMAKE_BUILD_TYPE=Debug -DLLVM_ENABLE_PROJECTS=all -DCMAKE_CXX_COMPILER=clang++ -DCMAKE_C_COMPILER=clang -DLLVM_USE_LINKER=lld -DLLVM_ENABLE_ASSERTIONS=ON -DLLVM_ENABLE_EH=ON -DLLVM_ENABLE_RTTI=ON`

  > Rememeber to [`rm build/CMakeCache.txt`](https://discourse.llvm.org/t/host-compiler-does-not-support-fuse-ld-lld-error-when-running-cmake-command-that-used-to-work/68008/5?u=hengfengwei)
when you failed on `cmake` and want to retry it.

- `ninja -C build check-llvm -j8`
	- `ninja -C build check-all -j8`

## References
- [Getting Started with the LLVM System](https://llvm.org/docs/GettingStarted.html)
- [Building LLVM with CMake](https://llvm.org/docs/CMake.html)
- [How do you build all of LLVM? @ stackoverflow](https://stackoverflow.com/a/68753935/1833118)
- [LLD - The LLVM Linker](https://lld.llvm.org/)