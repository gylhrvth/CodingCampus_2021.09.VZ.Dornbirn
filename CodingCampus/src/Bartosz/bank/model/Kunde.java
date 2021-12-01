package Bartosz.bank.model;

import java.util.Date;

public class Kunde {
        private long kundenNr;
        private String name;
        private String addresse;
        private Date geburtsdatum;

        public Kunde(long kundenNr, String name, String addresse, Date geburtsdatum) {
            this.kundenNr = kundenNr;
            this.name = name;
            this.addresse = addresse;
            this.geburtsdatum = geburtsdatum;
        }

        public long getKundenNr() {
            return kundenNr;
        }

        public void setKundenNr(long kundenNr) {
            this.kundenNr = kundenNr;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAdresse() {
            return addresse;
        }

        public void setAddress(String address) {
            this.addresse = address;
        }

        public Date getGeburtsdatum() {
            return geburtsdatum;
        }

        public void setGeburtsdatum(Date geburtsdatum) {
            this.geburtsdatum = geburtsdatum;
        }

        @Override
        public String toString() {
            return "Kunde{" +
                    "kundenNr=" + kundenNr +
                    ", name='" + name + '\'' +
                    ", addresse='" + addresse + '\'' +
                    ", geburtsdatum=" + geburtsdatum +
                    '}';
        }

    }
