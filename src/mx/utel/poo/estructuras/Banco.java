package mx.utel.poo.estructuras;

public record Banco(String nombre) {

    public Credito solicitarCredito(Cliente cli, double monto) {
        Categoria cat = cli.determinarCategoria();
        if( cat != null ) return autorizar( monto, cat );
        return null;
    }

    private Credito autorizar( double monto, Categoria cat ) {
        // ##### Utilizando estructura IF-ELSE ##############################
//        Credito cred = null;
//        if( cat == Categoria.CAT_A ) {
//            cred = new Credito( monto, 0.15 );
//        } else if ( cat == Categoria.CAT_B ) {
//            cred = new Credito( monto, 0.12 );
//        } else if ( cat == Categoria.CAT_C ) {
//            cred = new Credito( monto, 0.10 );
//        } else if ( cat == Categoria.CAT_D ){
//            cred = new Credito( monto, 0.08 );
//        }
//        return cred;

        // #### Utilizando estructura compuesta IF-RETURN #####################
//        if ( cat == Categoria.CAT_A ) return new Credito( monto, 0.15 );
//        if ( cat == Categoria.CAT_B ) return new Credito( monto, 0.12 );
//        if ( cat == Categoria.CAT_C ) return new Credito( monto, 0.10 );
//        if ( cat == Categoria.CAT_D ) return new Credito( monto, 0.08 );
//        else return null;

        // #### Utilizando estructura Switch ##################################
//        Credito cred = null;
//        switch( cat ) {
//            case CAT_A: cred = new Credito( monto, 0.15 );
//            case CAT_B: cred = new Credito( monto, 0.12 );
//            case CAT_C: cred = new Credito( monto, 0.10 );
//            case CAT_D: cred = new Credito( monto, 0.08 );
//        }
//        return cred;

        // #### Utilizando expresión switch #####################################
        return switch ( cat ) {
            case CAT_A -> new Credito(monto, 0.15);
            case CAT_B -> new Credito(monto, 0.12);
            case CAT_C -> new Credito(monto, 0.10);
            case CAT_D -> new Credito(monto, 0.08);
        };
    }

    @Override
    public String toString() {
        return nombre;
    }
}
