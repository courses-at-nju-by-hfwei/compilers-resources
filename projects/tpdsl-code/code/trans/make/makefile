#
# simple makefile to build two C files
#
t.o : t.c
	gcc -c -o t.o t.c

u.o : u.c
	gcc -c -o u.o u.c

go: t.o u.o
	gcc -o go t.o u.o
	echo done

clean:
	rm t.o u.o go
