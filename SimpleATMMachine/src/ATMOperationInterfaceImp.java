public class ATMOperationInterfaceImp implements ATMInterface {

    ATM atm = new ATM();

    @Override
    public void viewBalanace() {

        System.out.println(atm.getBalance());
    }

}
