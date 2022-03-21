aluno1 = { nome: 'João', nota: 6, disciplina: 'Ciências' }
aluno2 = { nome: 'Ana', nota: 2, disciplina: 'Física' }
aluno3 = { nome: 'Carlos', nota: 5, disciplina: 'Português' }
aluno4 = { nome: 'Daniel', nota: 8, disciplina: 'Matemática' }
aluno5 = { nome: 'Carol', nota: 9, disciplina: 'Literatura' }
alunos = [aluno1, aluno2, aluno3, aluno4, aluno5]

def testa_alunos(nome, nota, disciplina) 
  if nota >= 5
    puts("#{nome} foi aprovado com #{nota.to_s} em #{disciplina}.")
  else
    puts("#{nome} foi reprovado com #{nota.to_s} em #{disciplina}.")
  end
end

# Usando each (mesmo que o for, de certa forma)
alunos.each do |aluno|
  testa_alunos(aluno[:nome], aluno[:nota], aluno[:disciplina])
end

# Com for:
=begin for aluno in alunos do
  testa_alunos(aluno[:nome], aluno[:nota], aluno[:disciplina])
end
=end

# Com while
=begin cont = 0
while cont < alunos.length do
  testa_alunos(aluno[cont][:nome], aluno[cont][:nota], aluno[cont][:disciplina])
  cont += 1
end
=end

