package TasimaProjesi;

import Siparis.Siparis;
import Sofor.Sofor;
import TasitPackage.Tasit;

// Builder Pattern
public class TasimaProjesi {
    private Tasit tasit;
    private Siparis siparis;
    private Sofor sofor;

    private TasimaProjesi(Builder builder) {
        this.tasit = builder.tasit;
        this.sofor = builder.sofor;
        this.siparis = builder.siparis;
    }

    public static class Builder {
        private Tasit tasit;
        private Siparis siparis;
        private Sofor sofor;

        public Builder tasit(Tasit tasit) {
            this.tasit = tasit;
            return this;
        }

        public Builder siparis(Siparis siparis) {
            this.siparis = siparis;
            return this;
        }

        public Builder sofor(Sofor sofor) {
            this.sofor = sofor;
            return this;
        }

        public TasimaProjesi build() {
            return new TasimaProjesi(this);
        }
    }

    @Override
    public String toString() {
        return "TasimaProjesi{ " + tasit + ", " + siparis + ", " + sofor + '}';
    }
}
