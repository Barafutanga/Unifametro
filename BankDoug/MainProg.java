public class MainProg {
    public static void main(String[] args) {
        Client ct = new Client(); //instanciando a classe Client.java

        //adicionando cliente no banco
        ct.addClient("Marcos");

        //depositando dinheiro na conta
        ct.deposit(0, 1200); //0 é o nº da conta de Marcos

        //retirando dinheiro da conta
        ct.withdraw(0,200);
        
        //inspecionando dinheiro da conta
        ct.checkloan(0);

        //adicionando outro cliente no banco
        ct.addClient("Douglas");
        
        //depositando dinheiro da conta
        ct.deposit(1, 800); //1 é o nº da conta de Douglas

        //transferindo valores entre contas, de... para...
        ct.transfer(400, 0, 1);


        System.out.println("ACCOUNTS");

        //imprimindo a conta de Marcos
        //impressão formatada %s = string; %f = float; \n = quebra de linha
        System.out.printf("%s\nR$:%.2f\nAGENGY:%d. ACCOUNT:%d\n", ct.name[0], ct.loan[0], ct.agency[0], ct.ID[0]);
        
        //imprimindo a conta de Douglas
        System.out.printf("%s\nR$:%.2f\nAGENGY:%d. ACCOUNT:%d", ct.name[1], ct.loan[1], ct.agency[1], ct.ID[1]);
    }
}