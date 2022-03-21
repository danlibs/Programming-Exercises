require 'time'

class Funcionario

  attr_accessor :nome, :codigo
  attr_reader :ferias 

  def initialize(nome, codigo)
    @nome = nome 
    @codigo = codigo
    @ferias = false
    @data_inicio_ferias = nil
    @data_fim_ferias = nil
  end

  def inicia_ferias()
    @ferias = true
    @data_inicio_ferias = Time.now
  end

  def encerra_ferias()
    @ferias = false
    @data_fim_ferias = Time.now
  end

  def imprime()
    puts("Nome: #{@nome}")
    puts("Código: #{@codigo}")
    puts("De férias: #{@ferias}")
  end
end