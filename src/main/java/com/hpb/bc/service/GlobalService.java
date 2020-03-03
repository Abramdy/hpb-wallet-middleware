/*
 * Copyright 2020 HPB Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hpb.bc.service;

import com.hpb.bc.entity.result.Result;
import io.hpb.web3.protocol.core.methods.response.HpbBlockNumber;
import io.hpb.web3.protocol.core.methods.response.HpbGasPrice;
import io.hpb.web3.protocol.core.methods.response.HpbGetBalance;
import io.hpb.web3.protocol.core.methods.response.HpbHashrate;
import io.hpb.web3.protocol.core.methods.response.HpbMining;
import io.hpb.web3.protocol.core.methods.response.HpbSyncing;

public interface GlobalService {

	Result<HpbSyncing> hpbSyncing();

	Result<HpbMining> hpbMining();

	Result<HpbHashrate> hpbHashrate();

	Result<HpbGasPrice> hpbGasPrice();

	Result<HpbBlockNumber> hpbBlockNumber();

	Result<HpbGetBalance> hpbGetBalance(String address, String name);
    
    
}
