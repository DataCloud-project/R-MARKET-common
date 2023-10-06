package com.iexec.common.contract.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.DynamicBytes;
import org.web3j.abi.datatypes.DynamicStruct;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.7.0.
 */
@SuppressWarnings("rawtypes")
public class IexecLibOrders_v5 extends Contract {
    public static final String BINARY = "0x610fda610026600b82828239805160001a60731461001957fe5b30600052607381538281f3fe73000000000000000000000000000000000000000030146080604052600436106101205760003560e01c8063735f5619116100ac5780639a6f72ee1161007b5780639a6f72ee146101fb578063b75cdd5314610203578063c49f91d31461020b578063c4b7bfc314610213578063fed985fe1461021b57610120565b8063735f5619146101ba57806374147c4d146101c25780637c0d54d3146101d55780638ac03f33146101e857610120565b806359b123db116100f357806359b123db1461017c5780635b559f6a1461018457806365db1dbb146101975780636cf30b8b1461019f5780636f84d2da146101b257610120565b806311b2eee214610125578063207dbbfe1461014e57806320aabe53146101565780634118eb9814610169575b600080fd5b610138610133366004610b33565b61022e565b6040516101459190610df2565b60405180910390f35b6101386102ac565b610138610164366004610c0e565b6102d0565b610138610177366004610af9565b610315565b610138610345565b610138610192366004610cdf565b610369565b610138610399565b6101386101ad366004610af9565b6103bd565b6101386103ed565b610138610411565b6101386101d0366004610b65565b610435565b6101386101e3366004610b33565b610491565b6101386101f6366004610cad565b6104f2565b6101386105c7565b6101386105eb565b61013861060f565b610138610633565b610138610229366004610d3d565b610657565b80516020808301516040808501516060860151608087015160a088015160c089015160e08a0151955160009961028f997f6cfc932a5a3d22c4359295b9f433edff52b60703fa47690a04a83e40933dd47c9991989197969594939201610e42565b604051602081830303815290604052805190602001209050919050565b7f60815a0eeec47dddf1615fe53b31d016c31444e01b9d796db365443a6445d00881565b80516000907f7059544486a00d1bb02399a2ecff382c744930cef231e155091db6f4fe691b2e90610300906104f2565b60208085015160405161028f94939201610f28565b80516000907f075eb6f7578ff4292c241bd2484cd5c1d5e6ecc2ddd3317e1d8176b5a45865ec906103009061022e565b7fea59ddb9ba71c8e9808044ee8b113b22b9a86a49f8acb7da53dddde541a42aa981565b80516000907fea59ddb9ba71c8e9808044ee8b113b22b9a86a49f8acb7da53dddde541a42aa99061030090610657565b7f37bf7c82e888b2ca09eacad36645ae836b2ea9f93c2cf421b5b1ffe5d367ab9781565b80516000907f0638bb0702457e2b4b01be8a202579b8bf97e587fb4f2cc4d4aad01f21a06ee09061030090610491565b7f6cfc932a5a3d22c4359295b9f433edff52b60703fa47690a04a83e40933dd47c81565b7f7059544486a00d1bb02399a2ecff382c744930cef231e155091db6f4fe691b2e81565b60007f8b73c3c69bb8fe3d512ecc4cf759cc79239f7b179b0ffacaa9a75d522b39400f60001b8260000151805190602001208360200151805190602001208460400151856060015160405160200161028f959493929190610efc565b80516020808301516040808501516060860151608087015160a088015160c089015160e08a0151955160009961028f997f60815a0eeec47dddf1615fe53b31d016c31444e01b9d796db365443a6445d0089991989197969594939201610e42565b80516020808301516040808501516060860151608087015160a088015160c0890151945160009861054d987fef7f5bbae20250d52bb0e83c639127042afe45d9d487bdcd7bb3aba75f4dba1498919791969594939201610dfb565b60408051601f198184030181529082905260e08401516101008501516101208601516101408701516101608801516101808901516101a08a01516101c08b015180516020918201206101e08d0151999a6105a99a919201610d9e565b60408051601f198184030181529082905261028f9291602001610d6f565b7fef7f5bbae20250d52bb0e83c639127042afe45d9d487bdcd7bb3aba75f4dba1481565b7f0638bb0702457e2b4b01be8a202579b8bf97e587fb4f2cc4d4aad01f21a06ee081565b7f8b73c3c69bb8fe3d512ecc4cf759cc79239f7b179b0ffacaa9a75d522b39400f81565b7f075eb6f7578ff4292c241bd2484cd5c1d5e6ecc2ddd3317e1d8176b5a45865ec81565b80516020808301516040808501516060860151805190850120608087015160a088015160c089015160e08a01516101008b01516101208c01516101408d01516101608e0151995160009d61028f9d7f37bf7c82e888b2ca09eacad36645ae836b2ea9f93c2cf421b5b1ffe5d367ab979d919c919b9a999897969594939201610e90565b80356001600160a01b03811681146106f157600080fd5b92915050565b600082601f830112610707578081fd5b81356001600160401b0381111561071c578182fd5b61072f601f8201601f1916602001610f4e565b915080825283602082850101111561074657600080fd5b8060208401602084013760009082016020015292915050565b8035600281106106f157600080fd5b60006060828403121561077f578081fd5b6107896060610f4e565b905081356001600160401b03808211156107a257600080fd5b6107ae858386016107f7565b835260208401359150600282106107c457600080fd5b81602084015260408401359150808211156107de57600080fd5b506107eb848285016106f7565b60408301525092915050565b600061012080838503121561080a578182fd5b61081381610f4e565b91505061082083836106da565b815260208201356020820152604082013560408201526060820135606082015261084d83608084016106da565b608082015261085f8360a084016106da565b60a08201526108718360c084016106da565b60c082015260e082013560e0820152610100808301356001600160401b0381111561089b57600080fd5b6108a7858286016106f7565b82840152505092915050565b60006102208083850312156108c6578182fd5b6108cf81610f4e565b9150506108dc83836106da565b8152602082013560208201526108f583604084016106da565b60408201526060820135606082015261091183608084016106da565b608082015260a082013560a082015260c082013560c08201526109378360e084016106da565b60e08201526101008281013590820152610120808301359082015261014080830135908201526101608083013590820152610180610977848285016106da565b908201526101a061098a848483016106da565b908201526101c0828101356001600160401b03808211156109aa57600080fd5b6109b6868387016106f7565b838501526101e0925082850135838501526102009250828501359150808211156109df57600080fd5b506108a7858286016106f7565b60006101a08083850312156109ff578182fd5b610a0881610f4e565b915050610a1583836106da565b8152602082013560208201526040820135604082015260608201356001600160401b0380821115610a4557600080fd5b610a51858386016106f7565b60608401526080840135608084015260a084013560a084015260c084013560c084015260e084013560e08401526101009150610a8f858386016106da565b828401526101209150610aa4858386016106da565b828401526101409150610ab9858386016106da565b828401526101609150818401358284015261018091508184013581811115610ae057600080fd5b610aec868287016106f7565b8385015250505092915050565b600060208284031215610b0a578081fd5b81356001600160401b03811115610b1f578182fd5b610b2b8482850161076e565b949350505050565b600060208284031215610b44578081fd5b81356001600160401b03811115610b59578182fd5b610b2b848285016107f7565b600060208284031215610b76578081fd5b81356001600160401b0380821115610b8c578283fd5b9083019060808286031215610b9f578283fd5b610ba96080610f4e565b823582811115610bb7578485fd5b610bc3878286016106f7565b825250602083013582811115610bd7578485fd5b610be3878286016106f7565b60208301525060408301356040820152610c0086606085016106da565b606082015295945050505050565b600060208284031215610c1f578081fd5b81356001600160401b0380821115610c35578283fd5b9083019060608286031215610c48578283fd5b610c526060610f4e565b823582811115610c60578485fd5b610c6c878286016108b3565b825250610c7c866020850161075f565b6020820152604083013582811115610c92578485fd5b610c9e878286016106f7565b60408301525095945050505050565b600060208284031215610cbe578081fd5b81356001600160401b03811115610cd3578182fd5b610b2b848285016108b3565b600060208284031215610cf0578081fd5b81356001600160401b0380821115610d06578283fd5b9083019060608286031215610d19578283fd5b610d236060610f4e565b823582811115610d31578485fd5b610c6c878286016109ec565b600060208284031215610d4e578081fd5b81356001600160401b03811115610d63578182fd5b610b2b848285016109ec565b60008351610d81818460208801610f74565b835190830190610d95818360208801610f74565b01949350505050565b6001600160a01b03998a1681526020810198909852604088019690965260608701949094526080860192909252851660a085015290931660c083015260e08201929092526101008101919091526101200190565b90815260200190565b9788526001600160a01b03968716602089015260408801959095529285166060870152608086019190915290921660a084015260c083019190915260e08201526101000190565b9889526001600160a01b0397881660208a0152604089019690965260608801949094526080870192909252841660a0860152831660c085015290911660e08301526101008201526101200190565b9c8d526001600160a01b039b8c1660208e015260408d019a909a5260608c019890985260808b019690965260a08a019490945260c089019290925260e0880152610100870152841661012086015283166101408501529091166101608301526101808201526101a00190565b9485526020850193909352604084019190915260608301526001600160a01b0316608082015260a00190565b838152602081018390526060810160028310610f4057fe5b826040830152949350505050565b6040518181016001600160401b0381118282101715610f6c57600080fd5b604052919050565b60005b83811015610f8f578181015183820152602001610f77565b83811115610f9e576000848401525b5050505056fea2646970667358221220390c874a269bf2a5e5f4ca5edd0d444536602d32714c70568e95471094ece15764736f6c634300060c0033";

    public static final String FUNC_APPORDEROPERATION_TYPEHASH = "APPORDEROPERATION_TYPEHASH";

    public static final String FUNC_APPORDER_TYPEHASH = "APPORDER_TYPEHASH";

    public static final String FUNC_DATASETORDEROPERATION_TYPEHASH = "DATASETORDEROPERATION_TYPEHASH";

    public static final String FUNC_DATASETORDER_TYPEHASH = "DATASETORDER_TYPEHASH";

    public static final String FUNC_EIP712DOMAIN_TYPEHASH = "EIP712DOMAIN_TYPEHASH";

    public static final String FUNC_REQUESTORDEROPERATION_TYPEHASH = "REQUESTORDEROPERATION_TYPEHASH";

    public static final String FUNC_REQUESTORDER_TYPEHASH = "REQUESTORDER_TYPEHASH";

    public static final String FUNC_WORKERPOOLORDEROPERATION_TYPEHASH = "WORKERPOOLORDEROPERATION_TYPEHASH";

    public static final String FUNC_WORKERPOOLORDER_TYPEHASH = "WORKERPOOLORDER_TYPEHASH";

    public static final String FUNC_hash = "hash";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
        _addresses.put("1694571517499", "0xdDf6Cc5978e51572c02C8EE0dD3d0c3A42fa68B8");
        _addresses.put("1696504206405", "0x3A9Cdb8CB017A5BA7Fc60c916d27b34D7926FBAc");
        _addresses.put("1696504714436", "0xD9676582abe46385D5B27A745f4Add004D38A4f1");
        _addresses.put("1696505298244", "0xcA00F6bA1088dEa52d18AAA67D5B2C44172d551A");
    }

    @Deprecated
    protected IexecLibOrders_v5(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected IexecLibOrders_v5(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected IexecLibOrders_v5(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected IexecLibOrders_v5(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<byte[]> APPORDEROPERATION_TYPEHASH() {
        final Function function = new Function(FUNC_APPORDEROPERATION_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> APPORDER_TYPEHASH() {
        final Function function = new Function(FUNC_APPORDER_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> DATASETORDEROPERATION_TYPEHASH() {
        final Function function = new Function(FUNC_DATASETORDEROPERATION_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> DATASETORDER_TYPEHASH() {
        final Function function = new Function(FUNC_DATASETORDER_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> EIP712DOMAIN_TYPEHASH() {
        final Function function = new Function(FUNC_EIP712DOMAIN_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> REQUESTORDEROPERATION_TYPEHASH() {
        final Function function = new Function(FUNC_REQUESTORDEROPERATION_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> REQUESTORDER_TYPEHASH() {
        final Function function = new Function(FUNC_REQUESTORDER_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> WORKERPOOLORDEROPERATION_TYPEHASH() {
        final Function function = new Function(FUNC_WORKERPOOLORDEROPERATION_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> WORKERPOOLORDER_TYPEHASH() {
        final Function function = new Function(FUNC_WORKERPOOLORDER_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(DatasetOrder _datasetorder) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_datasetorder), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(RequestOrderOperation _requestorderoperation) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_requestorderoperation), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(DatasetOrderOperation _datasetorderoperation) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_datasetorderoperation), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(WorkerpoolOrderOperation _workerpoolorderoperation) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_workerpoolorderoperation), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(AppOrderOperation _apporderoperation) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_apporderoperation), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(EIP712Domain _domain) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_domain), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(AppOrder _apporder) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_apporder), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(RequestOrder _requestorder) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_requestorder), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(WorkerpoolOrder _workerpoolorder) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_workerpoolorder), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    @Deprecated
    public static IexecLibOrders_v5 load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new IexecLibOrders_v5(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static IexecLibOrders_v5 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new IexecLibOrders_v5(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static IexecLibOrders_v5 load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new IexecLibOrders_v5(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static IexecLibOrders_v5 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new IexecLibOrders_v5(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<IexecLibOrders_v5> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(IexecLibOrders_v5.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<IexecLibOrders_v5> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(IexecLibOrders_v5.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<IexecLibOrders_v5> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(IexecLibOrders_v5.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<IexecLibOrders_v5> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(IexecLibOrders_v5.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static class DatasetOrder extends DynamicStruct {
        public String dataset;

        public BigInteger datasetprice;

        public BigInteger volume;

        public byte[] tag;

        public String apprestrict;

        public String workerpoolrestrict;

        public String requesterrestrict;

        public byte[] salt;

        public byte[] sign;

        public DatasetOrder(String dataset, BigInteger datasetprice, BigInteger volume, byte[] tag, String apprestrict, String workerpoolrestrict, String requesterrestrict, byte[] salt, byte[] sign) {
            super(new org.web3j.abi.datatypes.Address(dataset),new org.web3j.abi.datatypes.generated.Uint256(datasetprice),new org.web3j.abi.datatypes.generated.Uint256(volume),new org.web3j.abi.datatypes.generated.Bytes32(tag),new org.web3j.abi.datatypes.Address(apprestrict),new org.web3j.abi.datatypes.Address(workerpoolrestrict),new org.web3j.abi.datatypes.Address(requesterrestrict),new org.web3j.abi.datatypes.generated.Bytes32(salt),new org.web3j.abi.datatypes.DynamicBytes(sign));
            this.dataset = dataset;
            this.datasetprice = datasetprice;
            this.volume = volume;
            this.tag = tag;
            this.apprestrict = apprestrict;
            this.workerpoolrestrict = workerpoolrestrict;
            this.requesterrestrict = requesterrestrict;
            this.salt = salt;
            this.sign = sign;
        }

        public DatasetOrder(Address dataset, Uint256 datasetprice, Uint256 volume, Bytes32 tag, Address apprestrict, Address workerpoolrestrict, Address requesterrestrict, Bytes32 salt, DynamicBytes sign) {
            super(dataset,datasetprice,volume,tag,apprestrict,workerpoolrestrict,requesterrestrict,salt,sign);
            this.dataset = dataset.getValue();
            this.datasetprice = datasetprice.getValue();
            this.volume = volume.getValue();
            this.tag = tag.getValue();
            this.apprestrict = apprestrict.getValue();
            this.workerpoolrestrict = workerpoolrestrict.getValue();
            this.requesterrestrict = requesterrestrict.getValue();
            this.salt = salt.getValue();
            this.sign = sign.getValue();
        }
    }

    public static class RequestOrder extends DynamicStruct {
        public String app;

        public BigInteger appmaxprice;

        public String dataset;

        public BigInteger datasetmaxprice;

        public String workerpool;

        public BigInteger workerpoolmaxprice;

        public BigInteger taskduration;

        public String requester;

        public BigInteger volume;

        public byte[] tag;

        public BigInteger category;

        public BigInteger trust;

        public String beneficiary;

        public String callback;

        public String params;

        public byte[] salt;

        public byte[] sign;

        public RequestOrder(String app, BigInteger appmaxprice, String dataset, BigInteger datasetmaxprice, String workerpool, BigInteger workerpoolmaxprice, BigInteger taskduration, String requester, BigInteger volume, byte[] tag, BigInteger category, BigInteger trust, String beneficiary, String callback, String params, byte[] salt, byte[] sign) {
            super(new org.web3j.abi.datatypes.Address(app),new org.web3j.abi.datatypes.generated.Uint256(appmaxprice),new org.web3j.abi.datatypes.Address(dataset),new org.web3j.abi.datatypes.generated.Uint256(datasetmaxprice),new org.web3j.abi.datatypes.Address(workerpool),new org.web3j.abi.datatypes.generated.Uint256(workerpoolmaxprice),new org.web3j.abi.datatypes.generated.Uint256(taskduration),new org.web3j.abi.datatypes.Address(requester),new org.web3j.abi.datatypes.generated.Uint256(volume),new org.web3j.abi.datatypes.generated.Bytes32(tag),new org.web3j.abi.datatypes.generated.Uint256(category),new org.web3j.abi.datatypes.generated.Uint256(trust),new org.web3j.abi.datatypes.Address(beneficiary),new org.web3j.abi.datatypes.Address(callback),new org.web3j.abi.datatypes.Utf8String(params),new org.web3j.abi.datatypes.generated.Bytes32(salt),new org.web3j.abi.datatypes.DynamicBytes(sign));
            this.app = app;
            this.appmaxprice = appmaxprice;
            this.dataset = dataset;
            this.datasetmaxprice = datasetmaxprice;
            this.workerpool = workerpool;
            this.workerpoolmaxprice = workerpoolmaxprice;
            this.taskduration = taskduration;
            this.requester = requester;
            this.volume = volume;
            this.tag = tag;
            this.category = category;
            this.trust = trust;
            this.beneficiary = beneficiary;
            this.callback = callback;
            this.params = params;
            this.salt = salt;
            this.sign = sign;
        }

        public RequestOrder(Address app, Uint256 appmaxprice, Address dataset, Uint256 datasetmaxprice, Address workerpool, Uint256 workerpoolmaxprice, Uint256 taskduration, Address requester, Uint256 volume, Bytes32 tag, Uint256 category, Uint256 trust, Address beneficiary, Address callback, Utf8String params, Bytes32 salt, DynamicBytes sign) {
            super(app,appmaxprice,dataset,datasetmaxprice,workerpool,workerpoolmaxprice,taskduration,requester,volume,tag,category,trust,beneficiary,callback,params,salt,sign);
            this.app = app.getValue();
            this.appmaxprice = appmaxprice.getValue();
            this.dataset = dataset.getValue();
            this.datasetmaxprice = datasetmaxprice.getValue();
            this.workerpool = workerpool.getValue();
            this.workerpoolmaxprice = workerpoolmaxprice.getValue();
            this.taskduration = taskduration.getValue();
            this.requester = requester.getValue();
            this.volume = volume.getValue();
            this.tag = tag.getValue();
            this.category = category.getValue();
            this.trust = trust.getValue();
            this.beneficiary = beneficiary.getValue();
            this.callback = callback.getValue();
            this.params = params.getValue();
            this.salt = salt.getValue();
            this.sign = sign.getValue();
        }
    }

    public static class WorkerpoolOrder extends DynamicStruct {
        public String workerpool;

        public BigInteger workerpoolprice;

        public BigInteger taskmaxduration;

        public String hardwaredescription;

        public BigInteger volume;

        public byte[] tag;

        public BigInteger category;

        public BigInteger trust;

        public String apprestrict;

        public String datasetrestrict;

        public String requesterrestrict;

        public byte[] salt;

        public byte[] sign;

        public WorkerpoolOrder(String workerpool, BigInteger workerpoolprice, BigInteger taskmaxduration, String hardwaredescription, BigInteger volume, byte[] tag, BigInteger category, BigInteger trust, String apprestrict, String datasetrestrict, String requesterrestrict, byte[] salt, byte[] sign) {
            super(new org.web3j.abi.datatypes.Address(workerpool),new org.web3j.abi.datatypes.generated.Uint256(workerpoolprice),new org.web3j.abi.datatypes.generated.Uint256(taskmaxduration),new org.web3j.abi.datatypes.Utf8String(hardwaredescription),new org.web3j.abi.datatypes.generated.Uint256(volume),new org.web3j.abi.datatypes.generated.Bytes32(tag),new org.web3j.abi.datatypes.generated.Uint256(category),new org.web3j.abi.datatypes.generated.Uint256(trust),new org.web3j.abi.datatypes.Address(apprestrict),new org.web3j.abi.datatypes.Address(datasetrestrict),new org.web3j.abi.datatypes.Address(requesterrestrict),new org.web3j.abi.datatypes.generated.Bytes32(salt),new org.web3j.abi.datatypes.DynamicBytes(sign));
            this.workerpool = workerpool;
            this.workerpoolprice = workerpoolprice;
            this.taskmaxduration = taskmaxduration;
            this.hardwaredescription = hardwaredescription;
            this.volume = volume;
            this.tag = tag;
            this.category = category;
            this.trust = trust;
            this.apprestrict = apprestrict;
            this.datasetrestrict = datasetrestrict;
            this.requesterrestrict = requesterrestrict;
            this.salt = salt;
            this.sign = sign;
        }

        public WorkerpoolOrder(Address workerpool, Uint256 workerpoolprice, Uint256 taskmaxduration, Utf8String hardwaredescription, Uint256 volume, Bytes32 tag, Uint256 category, Uint256 trust, Address apprestrict, Address datasetrestrict, Address requesterrestrict, Bytes32 salt, DynamicBytes sign) {
            super(workerpool,workerpoolprice,taskmaxduration,hardwaredescription,volume,tag,category,trust,apprestrict,datasetrestrict,requesterrestrict,salt,sign);
            this.workerpool = workerpool.getValue();
            this.workerpoolprice = workerpoolprice.getValue();
            this.taskmaxduration = taskmaxduration.getValue();
            this.hardwaredescription = hardwaredescription.getValue();
            this.volume = volume.getValue();
            this.tag = tag.getValue();
            this.category = category.getValue();
            this.trust = trust.getValue();
            this.apprestrict = apprestrict.getValue();
            this.datasetrestrict = datasetrestrict.getValue();
            this.requesterrestrict = requesterrestrict.getValue();
            this.salt = salt.getValue();
            this.sign = sign.getValue();
        }
    }

    public static class AppOrder extends DynamicStruct {
        public String app;

        public BigInteger appprice;

        public BigInteger volume;

        public byte[] tag;

        public String datasetrestrict;

        public String workerpoolrestrict;

        public String requesterrestrict;

        public byte[] salt;

        public byte[] sign;

        public AppOrder(String app, BigInteger appprice, BigInteger volume, byte[] tag, String datasetrestrict, String workerpoolrestrict, String requesterrestrict, byte[] salt, byte[] sign) {
            super(new org.web3j.abi.datatypes.Address(app),new org.web3j.abi.datatypes.generated.Uint256(appprice),new org.web3j.abi.datatypes.generated.Uint256(volume),new org.web3j.abi.datatypes.generated.Bytes32(tag),new org.web3j.abi.datatypes.Address(datasetrestrict),new org.web3j.abi.datatypes.Address(workerpoolrestrict),new org.web3j.abi.datatypes.Address(requesterrestrict),new org.web3j.abi.datatypes.generated.Bytes32(salt),new org.web3j.abi.datatypes.DynamicBytes(sign));
            this.app = app;
            this.appprice = appprice;
            this.volume = volume;
            this.tag = tag;
            this.datasetrestrict = datasetrestrict;
            this.workerpoolrestrict = workerpoolrestrict;
            this.requesterrestrict = requesterrestrict;
            this.salt = salt;
            this.sign = sign;
        }

        public AppOrder(Address app, Uint256 appprice, Uint256 volume, Bytes32 tag, Address datasetrestrict, Address workerpoolrestrict, Address requesterrestrict, Bytes32 salt, DynamicBytes sign) {
            super(app,appprice,volume,tag,datasetrestrict,workerpoolrestrict,requesterrestrict,salt,sign);
            this.app = app.getValue();
            this.appprice = appprice.getValue();
            this.volume = volume.getValue();
            this.tag = tag.getValue();
            this.datasetrestrict = datasetrestrict.getValue();
            this.workerpoolrestrict = workerpoolrestrict.getValue();
            this.requesterrestrict = requesterrestrict.getValue();
            this.salt = salt.getValue();
            this.sign = sign.getValue();
        }
    }

    public static class EIP712Domain extends DynamicStruct {
        public String name;

        public String version;

        public BigInteger chainId;

        public String verifyingContract;

        public EIP712Domain(String name, String version, BigInteger chainId, String verifyingContract) {
            super(new org.web3j.abi.datatypes.Utf8String(name),new org.web3j.abi.datatypes.Utf8String(version),new org.web3j.abi.datatypes.generated.Uint256(chainId),new org.web3j.abi.datatypes.Address(verifyingContract));
            this.name = name;
            this.version = version;
            this.chainId = chainId;
            this.verifyingContract = verifyingContract;
        }

        public EIP712Domain(Utf8String name, Utf8String version, Uint256 chainId, Address verifyingContract) {
            super(name,version,chainId,verifyingContract);
            this.name = name.getValue();
            this.version = version.getValue();
            this.chainId = chainId.getValue();
            this.verifyingContract = verifyingContract.getValue();
        }
    }

    public static class RequestOrderOperation extends DynamicStruct {
        public RequestOrder order;

        public byte[] sign;

        public RequestOrderOperation(RequestOrder order, byte[] sign) {
            super(order,new org.web3j.abi.datatypes.DynamicBytes(sign));
            this.order = order;
            this.sign = sign;
        }

        public RequestOrderOperation(RequestOrder order, DynamicBytes sign) {
            super(order,sign);
            this.order = order;
            this.sign = sign.getValue();
        }
    }

    public static class DatasetOrderOperation extends DynamicStruct {
        public DatasetOrder order;

        public byte[] sign;

        public DatasetOrderOperation(DatasetOrder order, byte[] sign) {
            super(order,new org.web3j.abi.datatypes.DynamicBytes(sign));
            this.order = order;
            this.sign = sign;
        }

        public DatasetOrderOperation(DatasetOrder order, DynamicBytes sign) {
            super(order,sign);
            this.order = order;
            this.sign = sign.getValue();
        }
    }

    public static class WorkerpoolOrderOperation extends DynamicStruct {
        public WorkerpoolOrder order;

        public byte[] sign;

        public WorkerpoolOrderOperation(WorkerpoolOrder order, byte[] sign) {
            super(order,new org.web3j.abi.datatypes.DynamicBytes(sign));
            this.order = order;
            this.sign = sign;
        }

        public WorkerpoolOrderOperation(WorkerpoolOrder order, DynamicBytes sign) {
            super(order,sign);
            this.order = order;
            this.sign = sign.getValue();
        }
    }

    public static class AppOrderOperation extends DynamicStruct {
        public AppOrder order;

        public byte[] sign;

        public AppOrderOperation(AppOrder order, byte[] sign) {
            super(order,new org.web3j.abi.datatypes.DynamicBytes(sign));
            this.order = order;
            this.sign = sign;
        }

        public AppOrderOperation(AppOrder order, DynamicBytes sign) {
            super(order,sign);
            this.order = order;
            this.sign = sign.getValue();
        }
    }
}
