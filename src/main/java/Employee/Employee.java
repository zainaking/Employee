package Employee;

    abstract class employee {
        private String firstName;
        private int socialSecurity;
        protected String lastName ;
        protected Date hiredDates;




        public employee (String firstNameame, String lastName, int socialSecurity, Date x ){

            this.firstName = firstName; //
            this.lastName = lastName ; //
            this.socialSecurity = socialSecurity;





        }

        abstract public String calculatePay (); // bluePrint for how you want it to be made


        @Override
        public String toString() {
            return "employee{" +
                    "firstName='" + firstName + '\'' +
                    ", socialSecurity=" + socialSecurity +
                    ", lastName='" + lastName + '\'' +
                    ", hiredDates=" + hiredDates +
                    '}';







        }
}
