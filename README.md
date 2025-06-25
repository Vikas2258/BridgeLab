This is my README file 

Date: 23/06/2025
Topic: git and gitbash.

Introduction to GIT: 
  Git is distributed version control system that tracks changes in source code during software development.
  It helps to collaborate,manage code history and different versions.
  Created by Linus Torvalds in 2005.

What is Git Bash?
it is command-line interface(CLI) that aloow user to interact with Git on windows.

Before git SVN was there which doesn' t work remotely but git provide this.

Local Repository: it is the Git repository stored on our local computer.It includes working directory,staging area and contain .git folder.

Remote Repository: it is a version of our project hosted online usually on platforms like github, gitlab.Used for collaboration, backup, and deployment.
You can push your code to remote or pull from it.

GIT Commands
echo "#This is my bridgelab" >> README.md -> this is for creating the readme file
git init ->this for initializing the foler into local repository
git add . ->through untracked files to tracked files in local repository
git commit -m "First commit" -> commit all the changes we have done
git remote add origin https://github.com/yourname/repo.git  -> connect local with remote repository.
git push -u origin main -> push all the work from local machines to remote repository

nano README.md is used to edit the readme file 
Touch filename : is used to create empty file 
git branch branch_name is used to create different branch
