Git commands:

to download project from github at start:
go to github and click clone/download.  copy the link (ssh link)
go to terminal and type 'git clone' then paste path copied in.

Create a new branch to work on:
NOTE: this will only create the branch on your own git in your computer.
branchName should have something like feature/what you are doing or bugfix/what you are fixing

Before creating the new branch make sure you have checked out the branch you want as a starting point (develop possibly?)

git checkout -b branchName

Push branch to GitHub:
this will add the branch to git hub
git push origin branch

Checkout and existing branch:
git checkout branchName

Merging back to main branch:

1. Check out the branch you want to merge to (ie develop)
2. git pull origin branchName (ie develop)  (this will ensure the develop in your git repo is up to date with the remote in case someone else has already merged into it)
3. check out the branch you were working on (ie featureBranch) that you want to merge INTO the branch from step 1
4. git merge branchName (ie develop) this is merging any changes made to the branch at step 1 into
your branch.  Hopefully without conflicts
5. checkout branch you want to merge into
6. git merge featureBranch
7. git push to update github

What to do if you get conflicts:
pray and look up the notes!
