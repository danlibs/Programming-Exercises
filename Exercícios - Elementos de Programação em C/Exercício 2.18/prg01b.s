	.file	"prg01b.c"
	.text
	.section	.rodata
.LC0:
	.string	"%lf \303\251 maior que %lf\n"
	.text
	.globl	imp_maior
	.type	imp_maior, @function
imp_maior:
.LFB0:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movsd	a(%rip), %xmm0
	movsd	b(%rip), %xmm1
	comisd	%xmm1, %xmm0
	jbe	.L6
	movsd	b(%rip), %xmm0
	movq	a(%rip), %rax
	movapd	%xmm0, %xmm1
	movq	%rax, %xmm0
	leaq	.LC0(%rip), %rax
	movq	%rax, %rdi
	movl	$2, %eax
	call	printf@PLT
	jmp	.L7
.L6:
	movsd	a(%rip), %xmm0
	movq	b(%rip), %rax
	movapd	%xmm0, %xmm1
	movq	%rax, %xmm0
	leaq	.LC0(%rip), %rax
	movq	%rax, %rdi
	movl	$2, %eax
	call	printf@PLT
.L7:
	nop
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE0:
	.size	imp_maior, .-imp_maior
	.ident	"GCC: (GNU) 11.1.0"
	.section	.note.GNU-stack,"",@progbits
