# Explaination of Git Commands

- git config
Configurates git (e.g. username, email)
- git init
Creates a new repository
- git commit
Saves a version of the changes. A message is required, which explains the changes. Used frequently.
- git status
Shows the current status of the repository. Used frequently.
- git add
 Adds changes of a file to the staging area, in order to be able to save them at the next commit. Used frequently.
- git log
Shows all commits that have been made in a repository
- git diff
Shows differences between current status of a file and the latest version.
- git pull
Gets the recent changes of a repository and adds them to the local repository. Used frequently.
- git push
Sends local commits to a repository. Used frequently.
- git branch
Creates a new branch or lists existing branches.
- git checkout
Switches between different branches or versions of files.
- git merge
Combines changes from two branches.

## Approximate sequence of execution

1. git config
2. git status
3. git add
4. git commit -m
5. git log
6. git diff
7. git branch
8. git checkout
9. git merge
10. git push
11. git pull