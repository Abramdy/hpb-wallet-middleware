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

package com.hpb.bc.website.mapper;

import com.hpb.bc.entity.IssueVoteResult;
import com.hpb.bc.example.IssueVoteResultExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IssueVoteResultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    long countByExample(IssueVoteResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    int deleteByExample(IssueVoteResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    int insert(IssueVoteResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    int insertSelective(IssueVoteResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    List<IssueVoteResult> selectByExample(IssueVoteResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    IssueVoteResult selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IssueVoteResult record, @Param("example") IssueVoteResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IssueVoteResult record, @Param("example") IssueVoteResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IssueVoteResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue_vote_result
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IssueVoteResult record);
    int insertBatch(List<IssueVoteResult> records);
}