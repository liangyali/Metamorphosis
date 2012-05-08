/*
 * (C) 2007-2012 Alibaba Group Holding Limited.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Authors:
 *   wuhua <wq163@163.com> , boyan <killme2008@gmail.com>
 */
package com.taobao.metamorphosis.server.utils;

/**
 * 针对某个topic的特殊配置（不使用全局配置）
 * 
 * @author 无花
 * @since 2011-8-18 下午2:30:35
 */
// TODO 将其他针对某个topic的特殊配置项移到这里
public class TopicConfig {
    private String topic;
    private int unflushThreshold;
    private int unflushInterval;
    private String dataPath;
    private String deleteWhen;
    private String deletePolicy;
    private int numPartitions;


    public TopicConfig(final String topic, final MetaConfig metaConfig) {
        this.topic = topic;
        this.unflushThreshold = metaConfig.getUnflushThreshold();
        this.unflushInterval = metaConfig.getUnflushInterval();
        this.dataPath = metaConfig.getDataPath();
        this.deleteWhen = metaConfig.getDeleteWhen();
        this.deletePolicy = metaConfig.getDeletePolicy();
        this.numPartitions = metaConfig.getNumPartitions();
    }


    public int getNumPartitions() {
        return this.numPartitions;
    }


    public void setNumPartitions(final int numPartitions) {
        this.numPartitions = numPartitions;
    }


    public String getDeletePolicy() {
        return this.deletePolicy;
    }


    public void setDeletePolicy(final String deletePolicy) {
        this.deletePolicy = deletePolicy;
    }


    public String getDeleteWhen() {
        return this.deleteWhen;
    }


    public void setDeleteWhen(final String deleteWhen) {
        this.deleteWhen = deleteWhen;
    }


    public String getDataPath() {
        return this.dataPath;
    }


    public void setDataPath(final String dataPath) {
        this.dataPath = dataPath;
    }


    public String getTopic() {
        return this.topic;
    }


    public void setTopic(final String topic) {
        this.topic = topic;
    }


    public int getUnflushThreshold() {
        return this.unflushThreshold;
    }


    public void setUnflushThreshold(final int unflushThreshold) {
        this.unflushThreshold = unflushThreshold;
    }


    public int getUnflushInterval() {
        return this.unflushInterval;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (this.dataPath == null ? 0 : this.dataPath.hashCode());
        result = prime * result + (this.deletePolicy == null ? 0 : this.deletePolicy.hashCode());
        result = prime * result + (this.deleteWhen == null ? 0 : this.deleteWhen.hashCode());
        result = prime * result + this.numPartitions;
        result = prime * result + (this.topic == null ? 0 : this.topic.hashCode());
        result = prime * result + this.unflushInterval;
        result = prime * result + this.unflushThreshold;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        TopicConfig other = (TopicConfig) obj;
        if (this.dataPath == null) {
            if (other.dataPath != null) {
                return false;
            }
        }
        else if (!this.dataPath.equals(other.dataPath)) {
            return false;
        }
        if (this.deletePolicy == null) {
            if (other.deletePolicy != null) {
                return false;
            }
        }
        else if (!this.deletePolicy.equals(other.deletePolicy)) {
            return false;
        }
        if (this.deleteWhen == null) {
            if (other.deleteWhen != null) {
                return false;
            }
        }
        else if (!this.deleteWhen.equals(other.deleteWhen)) {
            return false;
        }
        if (this.numPartitions != other.numPartitions) {
            return false;
        }
        if (this.topic == null) {
            if (other.topic != null) {
                return false;
            }
        }
        else if (!this.topic.equals(other.topic)) {
            return false;
        }
        if (this.unflushInterval != other.unflushInterval) {
            return false;
        }
        if (this.unflushThreshold != other.unflushThreshold) {
            return false;
        }
        return true;
    }


    public void setUnflushInterval(final int unflushInterval) {
        this.unflushInterval = unflushInterval;
    }


    @Override
    public String toString() {
        return "TopicConfig [topic=" + this.topic + ", unflushThreshold=" + this.unflushThreshold
                + ", unflushInterval=" + this.unflushInterval + ", dataPath=" + this.dataPath + ", deleteWhen="
                + this.deleteWhen + "]";
    }

}