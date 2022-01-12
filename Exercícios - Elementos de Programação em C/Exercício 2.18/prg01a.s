	.file	"prg01a.c"
	.text
	.section	.rodata
.LC1:
	.string	"M\303\251dia: %lf\n"
	.text
	.globl	imp_media
	.type	imp_media, @function
imp_media:
.LFB0:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movsd	a(%rip), %xmm1
	movsd	b(%rip), %xmm0
	addsd	%xmm1, %xmm0
	movsd	.LC0(%rip), %xmm1
	divsd	%xmm1, %xmm0
	movq	%xmm0, %rax
	movq	%rax, %xmm0
	leaq	.LC1(%rip), %rax
	movq	%rax, %rdi
	movl	$1, %eax
	call	printf@PLT
	nop
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE0:
	.size	imp_media, .-imp_media
	.section	.rodata
	.align 8
.LC0:
	.long	0
	.long	1073741824
	.ident	"GCC: (GNU) 11.1.0"
	.section	.note.GNU-stack,"",@progbits
