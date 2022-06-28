#!/usr/bin/env groovy       
                
def dev(env){                       
    def pipelineName;                       
                           
    if(env.APP_TYPE == 'test'){                  
      pipelineName = 'pipelineForTest'       
    }
                        
    return pipelineName       
}
def pre(env){                       
    def pipelineName;                       
                           
    if(env.APP_TYPE == 'test'){                  
      pipelineName = 'pipelineForTest'       
    }
                        
    return pipelineName       
}
