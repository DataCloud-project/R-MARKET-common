# iexec-common

## Steps to genreate Java Wrappers for Smart Contacts


```
git clone https://github.com/iExecBlockchainComputing/PoCo-dev/
cd PoCo-dev
git checkout x.y.z
npm i
./node_modules/.bin/truffle compile
# Get epirus-cli (recommended)
epirus generate truffle --truffle-json ~/iexecdev/PoCo-dev/build/contracts/App.json -o ~/iexecdev/iexec-common/src/main/java/ -p com.iexec.common.contract.generated
epirus generate truffle --truffle-json ~/iexecdev/PoCo-dev/build/contracts/Dataset.json -o ~/iexecdev/iexec-common/src/main/java/ -p com.iexec.common.contract.generated
epirus generate truffle --truffle-json ~/iexecdev/PoCo-dev/build/contracts/Ownable.json -o ~/iexecdev/iexec-common/src/main/java/ -p com.iexec.common.contract.generated

# Rename IexecInterfaceTokenABILegacy.json to IexecHubContract.json
#comment tuple json parts
epirus generate truffle --truffle-json ~/iexecdev/PoCo-dev/build/contracts/IexecHubContract.json -o ~/iexecdev/iexec-common/src/main/java/ -p com.iexec.common.contract.generated


# Clean IexecLibOrders_v5.OrderOperationEnum references from IexecLibOrders_v5.json, then
epirus generate truffle --truffle-json ~/iexecdev/PoCo-dev/build/contracts/IexecLibOrders_v5.json -o ~/iexecdev/iexec-common/src/main/java/ -p com.iexec.common.contract.generated

```
