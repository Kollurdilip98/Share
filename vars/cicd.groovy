
def down(repo)
{
  git "https://github.com/Kollurdilip98/${repo}.git"
}
def building()
{
  sh 'mvn package'
}
