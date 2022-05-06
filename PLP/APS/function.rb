class Oven
    def on
        puts "fire!"
    end
    def off
        result = x - y
        puts "turn off"
    end
    def cook
        d20 = rand(1..20)
        if d20 (17..20)
            print 'Delicious!'
        elsif d20 (10..16)
            print 'Better than nothing, i guess'
        elsif d20 (2..9)
            print 'Blergh!'
        else print 'Critical failure, your recipe kills everybody'
        end
    end
    
    forno = Oven.new
    forno.cook
    