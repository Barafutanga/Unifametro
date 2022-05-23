# Calcula fatoral usnado recursididade

def RecursiveFactorial(number)
    
    # Caso base:
    if (0..1).include?(number)
        return 1
    end
    
    #Chamada recursiva:
    number * RecursiveFactorial(number - 1)
end

# Chamando o método:
print RecursiveFactorial(4)