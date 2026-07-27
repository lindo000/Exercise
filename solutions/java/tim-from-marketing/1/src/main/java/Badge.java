class Badge {
    public String print(Integer id, String name, String department) {
        String IDBATCH= "";

        if ( id != null && department != null){
            IDBATCH= ("["+id+"] - "+ name +" - "+ department.toUpperCase() );
        }else if (id == null && department != null){
            IDBATCH= (  name + " - "+ department.toUpperCase() );
        }
        //Owner  department == null
        else if (id == null && department == null){
            IDBATCH= ( name + " - OWNER" );
        } else if (id != null && department == null){
            IDBATCH= ("["+id+"] - "+ name +" - OWNER");
        }
            return IDBATCH;
}}
