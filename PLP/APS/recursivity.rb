# Ruby code for calculating the factorial of a number recursively.

def RecursiveFactorial(number)
    
    # Base Case:
    if (0..1).include?(number)
        return 1
    end
    
    #Recursive call:
    number * RecursiveFactorial(number - 1)
end
# Calling the method:

print RecursiveFactorial(4)