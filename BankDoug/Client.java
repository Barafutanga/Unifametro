public class Client {
    int vs = 10; //tamanho global dos vetores
    public String[] name = new String[vs]; //nome do dono da conta
    public double[] loan = new double[vs]; //dinheiro guardado no banco
    public int[] agency = new int[vs]; //agência da conta 
    public int[] ID = new int[vs]; //número da conta

    public Client() {}

    public Client(String[] name, double[] loan, int[] agency, int[] iD) {
        this.name = name;
        this.loan = loan;
        this.agency = agency;
        ID = iD;
    }

    public String[] getName() {
        return name;
    }
    public void setName(String[] name) {
        this.name = name;
    }
    public double[] getLoan() {
        return loan;
    }
    public int[] getAgency() {
        return agency;
    }
    public int[] getID() {
        return ID;
    }
    
    public void addClient(String newname) { //adiciona um novo cliente ao vetor
        for (int i = 0; i < vs; i++) { //laço de repetição
            if (name[i] == null) { //se nome for igual à nulo
                name[i] = newname;
                loan[i] = 0.0;
                ID[i] = i;
                agency[i] = 200 + i;
                break; //pula para fora do loop
            }
        }
    }
    public void remClient(int accountnum) { //remove o cliente selecionado do vetor
        for (int i = 0; i < vs; i++) { //laço de repetição
            if (ID[i] == accountnum) { //se nome for igual à ctname
                name[i] = null;
                loan[i] = 0.0;
                ID[i] = 0;
                agency[i] = 0;
                break;
            }
        }
    }
    public void deposit(int accountnum, double value) { //faz uma operação de depósito na conta do cliente
        for (int i = 0; i < vs; i++) {
            if (ID[i] == accountnum && value > 0) {
                loan[i] += value;
                break;
            }
        }
    }
    public void withdraw(int accountnum, double value) { //faz uma operação de retirada na conta do cliente
        for (int i = 0; i < vs; i++) {
            if (ID[i] == accountnum && value > 0) {
                loan[i] -= value;
                break;
            }
        }
    }
    public void checkloan(int accountnum) { //checagem de saldo
        for (int i = 0; i < vs; i++) { //laço de repetição
            if (ID[i] == accountnum) {
                System.out.println(loan[i]);
                break;
            }
        }
    }
    public void transfer(double value, int from, int to) { //transferência entre contas
        if (loan[from] > value) {
        withdraw(from, value); //uso do método withdraw para remover o valor da conta que transfere
        deposit(to, value); //uso do método deposito para depositar o valor na conta que recebe a tranferência
        } else {
            System.out.println("You aren't rich enough to transfer this value");
        }
    }

    /*
    public String toString() {
        return "Client [ID=" 
        + Arrays.toString(ID) 
        + "\n Agency=" 
        + Arrays.toString(agency) 
        + "\n Loan="
        + Arrays.toString(loan) 
        + "\n Name=" 
        + Arrays.toString(name);
    }
    */
}