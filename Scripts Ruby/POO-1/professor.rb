class Professor < Funcionario
  attr_accessor :disciplina

  def initialize(nome, codigo, disciplina)
    super(nome, codigo)
    @disciplina = disciplina
    @ferias = false
  end

  def imprime()
    super()
    puts("Disciplina: #{@disciplina}")
  end

end