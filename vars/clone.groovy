def call(String url, String branch){
    echo "git cloning"
    git url : "${url}", branch : "${branch}"
    echo "cloning successful"
}