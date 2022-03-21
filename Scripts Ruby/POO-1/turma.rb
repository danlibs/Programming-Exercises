class Turma
  attr_reader :alunos
  attr_accessor :nome, :numero_sala, :prof_responsavel

  def initialize(nome, numero_sala, prof_responsavel)
    @nome = nome 
    @numero_sala = numero_sala
    @prof_responsavel = prof_responsavel
    @alunos = []
  end

  def add_aluno(aluno)
    @alunos << aluno
  end

  def rem_aluno(aluno)
    @alunos.delete(aluno)
  end

  def qtd_alunos()
    return @alunos.size
  end

  private
  attr_writer :alunos
end