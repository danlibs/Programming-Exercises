class Aluno
  # Código que gera getters e setters para cada atributo 
  attr_accessor :nome, :telefone, :matricula

  def initialize(nome, telefone, matricula) 
    @nome = nome
    @telefone = telefone
    @matricula = matricula
  end
end