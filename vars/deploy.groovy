def call(String path=null, Integer port=3000, String name){
    if(path!=null){
        sh """

        export PATH="${path}:$PATH"
        pm2 delete "${name}" || true
        pm2 serve dist "${port}" --spa --name "${name}"
        pm2 save 
        """
    }else{
        sh """

        pm2 delete react || true
        pm2 serve dist "${port}" --spa --name "${name}"
        pm2 save 
        """
    }
    }