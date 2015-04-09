Download Arquivo ZIP
https://fastdl.mongodb.org/win32/mongodb-win32-x86_64-2008plus-3.0.1.zip

cd C:\Users\cams7\desenv\mongodb\mongodb-win32-x86_64-2008plus-3.0.1\bin
mongod --install --dbpath "C:\Users\cams7\desenv\mongodb\data" --logpath "C:\Users\cams7\desenv\mongodb\logs\log.txt"

#Iniciar mongodb
#services.msc

mongo localhost

#Create root account

use admin
db.createUser({user:'root', pwd:'12345', roles:['root']})

#Remove and reinstall mongodb

mongod --remove
mongod --install --auth --dbpath "C:\Users\cams7\desenv\mongodb\data" --logpath "C:\Users\cams7\desenv\mongodb\logs\log.txt"

mongo localhost
use admin
db.auth('root', '123456')

#Create new database

db.runCommand({create:"blog"})
use blog

#and create user for this db

db.createUser({user:'blog', pwd:'123456', roles:['readWrite', 'dbAdmin']})

#Create each db with each folder
#Stop mongodb and reinstall, first move old db to each folder

mongod --remove

#Create folder 'admin' and 'local' in 'data'
#Move  'admin files' to 'admin' and 'local files' to 'local'

mongod --install --auth --directoryperdb --dbpath "C:\Users\cams7\desenv\mongodb\data" --logpath "C:\Users\cams7\desenv\mongodb\logs\log.txt"


